package ex_prob04;

public class Bookdata {

	private String title;
	private int price;
	private String writer;

	// 기본 생성자
	public Bookdata() {
	}

	public Bookdata(String title, int price, String writer) {
		super();
		this.title = title;
		this.price = price;
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public int getPrice() {
		return price;
	}

	public String getWriter() {
		return writer;
	}

	@Override
	public String toString() {
		return "Bookdata [title=" + title + ", price=" + price + ", writer=" + writer + "]";
	}
}
