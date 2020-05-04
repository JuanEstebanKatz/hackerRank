package com.practica.diaria;
public class Book {
	
	String title;
	int pageCount;
	int ISBN;
	boolean isCheckout;
	int dayCheckedOut = -1;
	
	public Book(String bookTitle, int bookPageCount, int bookISBN) {
		this.title = bookTitle;
		this.pageCount = bookPageCount;
		this.ISBN = bookISBN;
		isCheckout = false;
		
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getPageCount() {
		return pageCount;
	}
	
	public int getISBN() {
		return ISBN;
	}
	
	public boolean getIsCheckout() {
		return isCheckout;
	}
	
	public int getDayCheckedOut() {
		return dayCheckedOut;
	}
	
	
	//set
	public void setIsCheckout(boolean isCheckout, int diaActual) {
		this.isCheckout = isCheckout;
		setDayCheckedOut(diaActual);
	}
	
	public void setDayCheckedOut(int day) {
		this.dayCheckedOut = day;
	}
	

}
