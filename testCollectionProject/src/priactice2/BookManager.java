package priactice2;

import java.util.*;

public class BookManager {
	private ArrayList bookList;
	
	public BookManager() {
		this.bookList = new ArrayList();
	}
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
			bookList.add(book);					
	}
	public void deleteBook(int index) {			
		bookList.remove(index);		
	}
	public int searchBook(String bTitle) {
		int index = -1;
		for(int i = 0; i < bookList.size(); i++) {
			if(((Book)bookList.get(i)).getTitle().equals(bTitle) == true) {
				index = i;
				break;
			}
		}
		return index;
	}
	public void printBook(int index) {
		System.out.println(bookList.get(index));
	}
	public void displayAll() {
		for(int i = 0; i < bookList.size(); i++) {
			System.out.println(bookList.get(i));
		}
	}
	public Book[] sortedBookList() {
		bookList.sort(new AscCategory());
		Book[] br = new Book[bookList.size()];	
		bookList.toArray(br);
		
		return br;
	}
	public void printBookList(Book[] br) {
		for(Book b : br) {
			System.out.print(b);
		}
	}
}
