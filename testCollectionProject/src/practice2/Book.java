package practice2;

import java.io.*;

public class Book implements Serializable{

	private static final long serialVersionUID = -3957617763682052746L;
	
	private String bNO; //도서번호
	private int category; //도서분류코드(1.인문/2.자연과학/3.의료/4.기타)
	private String title; //책제목
	private String author; //저
	
	public Book() {}
	public Book(String bNO, int category, String title, String author) {
		super();
		this.bNO = bNO;
		this.category = category;
		this.title = title;
		this.author = author;
	}
	public String getbNO() {
		return bNO;
	}
	public void setbNO(String bNO) {
		this.bNO = bNO;
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public String toString() {
		return this.bNO + "  " + this.category + "  " + this.title + "  " + this.author + "  ";
	}
	
}
