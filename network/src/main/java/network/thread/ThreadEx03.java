package network.thread;

public class ThreadEx03 {

	public static void main(String[] args) {
		Thread thread01 = new DigitThread();// Thread 객체 생성
		Thread thread02 = new AlphabetThread();
		Thread thread03 = new Thread(new UpperCaseAlphabetRunnableImpl());

		thread01.start();
		thread02.start();
		thread03.start();

		// 출력 -> a0ABb1c2C3Dd4Ee5fF6gG7hH8Ii9jJkKLlMmNnoOpPqQRrSstTuUVvWwXxYyzZ
	}

}
