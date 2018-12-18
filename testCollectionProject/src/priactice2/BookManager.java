package priactice2;

import java.util.*;

public class BookManager {
	private ArrayList bookList;
	
	public BookManager() {}

	public BookManager(ArrayList bookList) {
		super();
		this.bookList = bookList;
	}
	public void setBookList(ArrayList bookList) {
		this.bookList = bookList;
	}
	public ArrayList getBookList() {
		return this.bookList;
	}
	public void addBook(Book book) {
			
		bookList.add(book.getbNO());
		bookList.add(book.getCategory());
		bookList.add(book.getTitle());
		bookList.add(book.getAuthor());
		
	}
	public void deleteBook(int index) {
		Scanner sc = new Scanner(System.in);
		System.out.print("제거할 항목 : ");
		index = sc.nextInt();
		
		bookList.remove(index);
		
	}
	public int searchBook(String bTitle) {
		
		return 0;
	}
	public void printBook() {
		
	}
	public void displayAll() {
		
	}
	public Book[] sortedBookList() {
		return null;
	}
	public void printBookList(Book[] br) {
		
	}
}
