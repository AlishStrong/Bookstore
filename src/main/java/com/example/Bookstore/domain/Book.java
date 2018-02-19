package com.example.Bookstore.domain;

public class Book {
private String title;
private String author;
private int year;
private int isbn;
private boolean price;

public Book(String title, String author, int year, int isbn, boolean price) {

	this.title = title;
	this.author = author;
	this.year = year;
	this.isbn = isbn;
	this.price = price;
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

public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
}

public int getIsbn() {
	return isbn;
}

public void setIsbn(int isbn) {
	this.isbn = isbn;
}

public boolean isPrice() {
	return price;
}

public void setPrice(boolean price) {
	this.price = price;
}

}
