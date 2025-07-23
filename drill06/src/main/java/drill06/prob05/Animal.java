package drill06.prob05;

public class Animal {
	public static int count;

	public Animal() {
		System.out.println("동물 객체 생성!");
		Animal.count++;
	}
}
