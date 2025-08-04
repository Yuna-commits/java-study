package network.httpd;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.file.Files;

public class HttpRequestHandler extends Thread {
	private static final String DOCUMENT_ROOT = "./webapp";
	private static final String DEFAULT_FILE = "/index.html";
	private static final String ERROR_400_FILE = "/error/400.html";
	private static final String ERROR_404_FILE = "/error/404.html";

	private static final String OK = "200 OK";
	private static final String BAD_REQUEST = "400 Bad Request";
	private static final String FILE_NOT_FOUND = "404 File Not Found";

	private Socket socket;

	public HttpRequestHandler(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		try {
			// logging Remote Host IP Address & Port
			InetSocketAddress inetSocketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
			consoleLog("connected from " + inetSocketAddress.getAddress().getHostAddress() + ":"
					+ inetSocketAddress.getPort());

			// get IOStream
			OutputStream outputStream = socket.getOutputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));

			String request = null;

			// 빈 개행이 오면 중지(헤더만 화면에 출력)
			while (true) {
				String line = br.readLine();

				// 웹 브라우저가 연결을 끊으면,
				if (line == null) {
					consoleLog("closed by client");
					break;
				}

				// SimpleHttpServer는 Http Request Header만 처리
//				if ("".equals(line)) {
//					break;
//				}

				// Http Request Header의 첫 줄만 읽음
				if (request == null) {
					request = line;
					break;
				}
			}

			consoleLog(request);

			// tokens -> [method URL protocol]
			String[] tokens = request.split(" ");
			if ("GET".equals(tokens[0])) {
				response200(outputStream, tokens[1]);
			} else {
				// HTTP method: POST, PUT, DELETE, HEAD, CONNECT
				// SimpleHttpServer에서는 무시(400 Bad Request)
				response400(outputStream);
			}

		} catch (IOException ex) {
			consoleLog("error:" + ex);
		} finally {
			// clean-up
			try {
				if (socket != null && socket.isClosed() == false) {
					socket.close();
				}

			} catch (IOException ex) {
				consoleLog("error:" + ex);
			}
		}
	}

	public void response200(OutputStream outputStream, String url) throws IOException {
		// set default(welcome) file
		if ("/".equals(url)) {
			url = DEFAULT_FILE;
		}

		File file = new File(DOCUMENT_ROOT + url);

		if (!file.exists()) {
			response404(outputStream);
			return;
		}

		allResponse(outputStream, file, OK);
	}

	public void response400(OutputStream outputStream) throws IOException {
		File file = new File(DOCUMENT_ROOT+ERROR_400_FILE);

		if (!file.exists()) {
			writeSimpleMessage(outputStream, BAD_REQUEST, "잘못된 요청입니다.");
			return;
		}

		allResponse(outputStream, file, BAD_REQUEST);
	}

	public void response404(OutputStream outputStream) throws IOException {
		File file = new File(DOCUMENT_ROOT + ERROR_404_FILE);

		if (!file.exists()) {
			writeSimpleMessage(outputStream, FILE_NOT_FOUND, "요청한 리소스가 존재하지 않습니다.");
			return;
		}

		allResponse(outputStream, file, FILE_NOT_FOUND);
	}

	public void allResponse(OutputStream outputStream, File file, String message) throws IOException {
		// NIO(New I/O)
		byte[] body = Files.readAllBytes(file.toPath());// IOException
		String contentType = Files.probeContentType(file.toPath());

		// Response Header
		outputStream.write(("HTTP/1.1 " + message + "\n").getBytes("utf-8"));
		// Content-Type -> text/html이면 css 적용 x
		outputStream.write(("Content-Type:" + contentType + "; charset=utf-8\n").getBytes("utf-8"));
		outputStream.write("\n".getBytes("utf-8"));// 비어있는 개행

		// Response Body
		outputStream.write(body);
	}

	// 400.html, 404.html 파일이 없는 경우
	public void writeSimpleMessage(OutputStream outputStream, String status, String message) throws IOException {
		String body = "<html>" + 
				"<head><title>" + status + "</title></head>" + 
				"<body><h1>" + status + "</h1><p>"+message+"</body>" + 
				"</html>";

		byte[] bodyBytes = body.getBytes("utf-8");

		// Response Header
		outputStream.write(("HTTP/1.1 " + status + "\n").getBytes("utf-8"));
		outputStream.write(("Content-Type: text/html; charset=utf-8\n").getBytes("utf-8"));
		outputStream.write(("Content-Length: " + bodyBytes + "\n").getBytes("utf-8"));
		outputStream.write("\n".getBytes("utf-8"));// 비어있는 개행

		// Response Body
		outputStream.write(bodyBytes);
	}

	public void consoleLog(String message) {
		System.out.println("[Http Request Handler #" + getId() + "] " + message);
	}
}
