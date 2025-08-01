package network.thread;

public class ThreadEx01 {

	public static void main(String[] args) {
		// T1 thread
		new DigitThread().start();

		for (char c = 'a'; c <= 'z'; c++) {
			System.out.print(c);

			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// 출력 중 하나 -> abcdefg012345hijklmnopqrstuvwxyz6789
		// sleep(1) -> a0b1c2d3e4f5g6h7i8j9klmnopqrstuvwxyz
	}

}
