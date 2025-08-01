package network.thread;

public class ThreadEx02 {

	public static void main(String[] args) {
		Thread thread01 = new DigitThread();// Thread 객체 생성
		Thread thread02 = new AlphabetThread();

		thread01.start();

		thread02.start();

		System.out.println("main 종료");

		// 출력
		// -> main 종료
		// -> 0a1bc2d3e45f6g7h8i9jklmnopqrstuvwxyz
	}

}
