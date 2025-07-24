package chapter03.ex19;

public class Polymorphism {
	static interface Soundable {
		void sound();
	}

	// Inner Class
	static abstract class Animal implements Soundable {
		private String species;

		public abstract void sound();
	}

	static class Dog extends Animal {
		@Override
		public void sound() {
			System.out.println("멍멍");
		}
	}

	static class Sparrow extends Animal {
		@Override
		public void sound() {
			System.out.println("짹짹");
		}

	}

	static class AlarmBell extends Animal {
		@Override
		public void sound() {
			System.out.println("Alarm!");
		}
	}

	public static void main(String[] args) {
		Animal a1 = new Dog();
		Animal a2 = new Dog();

		a1.sound();
		a2.sound();

		Animal a3 = new AlarmBell();
		a3.sound();
	}

}
