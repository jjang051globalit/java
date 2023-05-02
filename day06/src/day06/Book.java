package day06;

public class Book {
	// 제목,작자
	public String title;
	public String author;
	
	public Book() {
		this("untitled","nonamed");
	}
	public Book(String title) {
		this.title = title;
		this.author = "작자미상";
	}
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public void showInfo() {
		System.out.println("제목은 "+title+", 작가는 "+author);
	}
}
