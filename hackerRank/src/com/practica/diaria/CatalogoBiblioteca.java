package com.practica.diaria;

import java.util.HashMap;
import java.util.Map;

public class CatalogoBiblioteca {

	Map<String, Book> coleccionBook = new HashMap<String,Book>();
	int currentDay= 0;
	int diasPrestamo =7;
	double multa = 0.5;
	double tasaInteres = 1.0;
	
	public CatalogoBiblioteca(Map<String, Book> coleccion) {
		this.coleccionBook = coleccion;
	}
	
	public CatalogoBiblioteca (Map<String, Book> coleccion, int diasPrestamo, double multa , double tasa) {
		this.coleccionBook = coleccion;
		this.diasPrestamo = diasPrestamo;
		this.multa = multa;
		this.tasaInteres = tasa;
		
	}
	
	public int getCurrentDay() {
		return this.currentDay;
	}
	
	public Map<String, Book> getColeccionBook() {
		return this.coleccionBook;
	}
	
	public Book getBook(String title) {
		return getColeccionBook().get(title);
	}
	
	public int getDiasPrestamo() {
		return this.diasPrestamo;
	}

	public double getMulta() {
		return this.multa;
	}
	
	public double getTasaInteres() {
		return this.tasaInteres;
	}

	//Instancias
	public void nextDay() {
		currentDay ++;
	}
	public void setDay(int day) {
		currentDay = day;
	}
	
	// Metodos Instancias
	public void checkOutBook(String title) {
		Book book = getBook(title);
		if(book.getIsCheckout()) {
			sorryBookAlreadyCheckOut(book);
		}else {
			book.setIsCheckout(true, currentDay);
			System.out.println("Acabas de reservar"+ title+" lo dejas "+(getCurrentDay()+getDiasPrestamo())+".");
		}
	}
	
	public void returnBook(String title) {
		Book book = getBook(title);
		int diasTarde = currentDay - (book.getDayCheckedOut()+ getDiasPrestamo());
		if (diasTarde>0) {
			System.out.println("LE debes a la biblioteca"+ (getDiasPrestamo()+diasTarde*tasaInteres)
					+"por que  tu libro esta"+diasTarde +"dias de retraso");
		}else {
			System.out.println("Libro retornado gracias");
		}
		book.setIsCheckout(false, -1);
	}
	
	public void sorryBookAlreadyCheckOut(Book book) {
		System.out.println("Sorrys"+ book.getTitle()+"ya esta ocupado"+
							"se retornara"+(book.getDayCheckedOut()+ getDiasPrestamo()+" ."));
		
	}

	public void setColeccionBook(Map<String, Book> coleccionBook) {
		this.coleccionBook = coleccionBook;
	}
	
	public static void main(String[] args) {
		Map<String, Book> bookColeccion = new HashMap<String, Book>();
		Book harry = new Book("Harry Potter",827123,99999);
		bookColeccion.put("Harry Potter", harry);
		CatalogoBiblioteca lib = new CatalogoBiblioteca(bookColeccion);
		lib.checkOutBook("Harry Potter");
		lib.nextDay();
		lib.nextDay();
		lib.checkOutBook("Harry Potter");
		lib.setDay(17);
		lib.returnBook("Harry Potter");
		lib.checkOutBook("Harry Potter");
		
	}
}
