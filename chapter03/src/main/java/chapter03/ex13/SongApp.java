package chapter03.ex13;

public class SongApp {
	public static void main(String[] args) {
		Song song1 = new Song("좋은날", "아이유", "Real", "이만수", 2010, 3);
		song1.show();

		Song song2 = new Song("Ditto", "New Jeans");
		song2.show();
	}
}
