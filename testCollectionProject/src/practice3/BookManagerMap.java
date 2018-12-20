package practice3;

import java.util.*;
import practice2.Book;

public class BookManagerMap {
	private HashMap booksMap;
	
	public BookManagerMap() {
		this.booksMap = new HashMap();
	}
	public BookManagerMap(HashMap booksMap) {
		this.booksMap = new HashMap(booksMap);
	}
	
	public void putBook(Book book) {
		booksMap.put(book.getbNO(), book/*new Book(book.getbNO(),book.getCategory(),book.getTitle(),book.getAuthor())*/);
	}
	public void removeBook(String key) {	
		booksMap.remove(key);
	}
	public String searchBook(String bTitle) {
		String st = null;
		Set hmap = booksMap.entrySet();
		Iterator iter = hmap.iterator();
		
		while(iter.hasNext()) {
			Map.Entry me = (Map.Entry)iter.next();
			String ss = (String)me.getKey();
			Book sss = (Book)me.getValue();
			if(sss.getTitle().equals(bTitle)) {
				st = (String)me.getKey();
			}
		}
		return st;
	}
	public void displayAll() {
		Set kSet= booksMap.keySet();
		Iterator iter = kSet.iterator();
		while(iter.hasNext()) {
			String no = (String)iter.next();
			Book b = (Book)booksMap.get(no);
			System.out.println(no + "=" + b);
		}
		
	}
	public Book[] sortedBookMap() {
		
		ArrayList arrList = new ArrayList(booksMap.values());
		arrList.sort(new TitleSort());
				
		Book[] br = new Book[booksMap.size()];
		arrList.toArray(br);
		
		return br;
	}
	
	public void printBookMap(Book[] br) {
		for(Book b : br) {
			System.out.println(b);
		}
	}
	public void printBook(String key) {
		System.out.println(booksMap.get(key));
	}
}
