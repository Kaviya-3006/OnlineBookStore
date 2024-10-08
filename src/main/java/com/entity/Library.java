package com.entity;

import javax.persistence.Entity;

@Entity
public class Library {
	private String name;
	private String area;
	private int pincode;

	public Library(String name, String area, int pincode) {
		super();
		this.name = name;
		this.area = area;
		this.pincode = pincode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

//	public Book[] getBooks() {
//		return books;
//	}

//	public void setBooks(Book[] books) {
//		this.books = books;
//	}
}
