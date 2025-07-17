package ch01;

public class Ex23SumToTen {
	public static void main(String[] args) {
		int sum = 0;

		for(int i=1;i<=10;i++) {
			sum+=i;
		}
		
		System.out.println("1 ~ 10 Sum: " + sum);
	}
}
