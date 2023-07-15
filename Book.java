	/*
	 * (C) Copyright 2023 Intern FPT. All Rights Reserved
	 * 
	 * @author HUONG
	 * @date Jul 15, 2023
	 * @version 1.0
	 */
package BookManagement;

public class Book {
	
	private String bookName;
	private double price;
	private int yearXB;
	private Author author;
	
	
	public Book(String bookName, double price, int yearXB, Author author) {
		this.bookName = bookName;
		this.price = price;
		this.yearXB = yearXB;
		this.author = author;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getYearXB() {
		return yearXB;
	}


	public void setYearXB(int yearXB) {
		this.yearXB = yearXB;
	}


	public Author getAuthor() {
		return author;
	}


	public void setAuthor(Author author) {
		this.author = author;
	}
	// ham in ten sach
	public void printBookName() {
		System.out.println("ten sach la: "+this.getBookName());
	}
	// ham kiem tra cung nam
	public boolean checkCungNam(Book bookKhac) {
		return this.getYearXB() == bookKhac.getYearXB();
	}
	// ham kiem tra giam gia
	public double tongSauGiamGia(double x) {
		return this.getPrice()*(1-x/100);
		
	}
	
	
	
	
	
}
