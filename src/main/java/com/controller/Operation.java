package com.controller;

import java.util.Scanner;

import com.entity.Book;
import com.entity.Library;

public class Operation 
{
	Library l = new Library("Anna Library", "Chetpet", 603202);
	int count = 0;
	Scanner sc = new Scanner(System.in);

	/*public void addBook() 
	{
		System.out.print("\tEnter Book Name : ");
		String bookname = sc.next();
		System.out.print("\tEnter Author Name : ");
		String name = sc.next();
		System.out.print("\tEnter Book Price : ");
		double price = sc.nextDouble();
		Book b = new Book(bookname, name, price);
		
		System.out.println("\t----Book Added----");
		
		
	}

	public void getAllData() {
		for (int i = 0; i < l.getBooks().length; i++) {
			if (l.getBooks()[i] != null) {
				System.out.println("\t" + l.getBooks()[i]);
			}
		}
	}

	int k = 0;
	Book[] newBook;
	int j = 0;

	public Book[] remove(String bookname) {
		for (int i = 0; i < l.getBooks().length; i++) {
			if (l.getBooks()[i] != null) {
				if (l.getBooks()[i].getBookName().equalsIgnoreCase(bookname)) {
					k++;
				}
			}
		}
		newBook = new Book[l.getBooks().length - k];
		for (int i = 0; i < l.getBooks().length; i++) {
			if (l.getBooks()[i] != null) {
				if (l.getBooks()[i].getBookName().equalsIgnoreCase(bookname)) {
					newBook[j++] = l.getBooks()[i];
				}
			}
		}
		l.setBooks(newBook);
		return l.getBooks();
	}

	public Book getBookById(int id) {
		for (int i = 0; i < l.getBooks().length; i++) {
			if (l.getBooks()[i] != null) {
				if (l.getBooks()[i].getId() == id) {
					return l.getBooks()[i];
				}
			}
		}
		return null;
	}

	public Book update(int id) {
		return getBookById(id);
	}*/
}