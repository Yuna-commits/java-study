package exercise03.prob07;

public class Book {
	// status 0: 대여중, 1: 재고있음
	private int no, status;
	private String title, author;

	public Book(int no, String title, String author) {
		this.no = no;
		this.title = title;
		this.author = author;
		this.status = 1;
	}

	public void rent() {
		this.status = 0;
		System.out.println(title + "(이)가 대여되었습니다.");
	}

	public void print() {
		System.out.println(
				"[" + no + "] 제목: " + title + ", 작가: " + author 
				+ ", 상태: " + ((status == 0) ? "대여중" : "재고있음"));
	}
}
