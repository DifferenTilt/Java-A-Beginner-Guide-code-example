package chapter8.bookpackext;

import chapter8.bookpack.Book;

// Demonstrate protected
public class ExtBook extends Book{
	private String publisher;

	// Here the constructor uses part of the constructor defined in the superclass 
	// the rest is handled locally
	public ExtBook(String title, String author, int pubDate, String publisher) {
		super(title, author, pubDate);
		this.publisher = publisher;
	}
	
	public void show() {
		super.show();
		System.out.println(publisher);
		System.out.println();
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	/*
	 * These are OK because subclass can access a protected member.
	 */
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	// Another possibility is to define getter and setter in superclass 
	// and be aware of fact that they MUST BE public. 
}
