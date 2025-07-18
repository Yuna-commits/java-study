package ch01;

public class Ex38MainArgsExample {
	public static void main(String[] args) {
		System.out.println("명령줄에 전달된 인자 개수:" + args.length);
		
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}
}