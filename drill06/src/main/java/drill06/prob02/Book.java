package drill06.prob02;

public class Book {
	private String title;
	private int price;

	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}

	public String toString() {
		return "Book[title=" + title + ", price=" + price + "]";
	}
}
