package com.DAO;

import java.sql.SQLException;
import java.util.Scanner;
import com.controller.Operation;
import com.entity.Book;

public class LibraryManagement {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		Operation op = new Operation();
		while (true) {
			System.out.println("\t------------------------------------------");
			System.out.println("\t||\t Library Management System \t||");
			System.out.println("\t------------------------------------------");
			System.out.println(
					"\t1. AddBook\n\t2. GetAllData\n\t3. GetBookByID\n\t4. UpdateBook\n\t5. RemoveBook\n\t6. Exit\n");
			System.out.print("\tEnter your Choice: ");
			int choice = sc.nextInt();
			switch (choice) {
			/*case 1: {

				op.addBook();
			}
				break;

			case 2: {
				op.getAllData();
				// op.fetchData(1);
			}
				break;

			case 3: {
				System.out.print("\tEnter Book ID : ");
				int id = sc.nextInt();
				Book b = op.getBookById(id);
				if (b != null) {
					System.out.println("\tBook ID : " + ((Book) b).getId());
					System.out.println("\tBook Name : " + ((Book) b).getBookName());
					System.out.println("\tBook Author Name : " + ((Book) b).getAuthor());
					System.out.println("\tBook Price : " + ((Book) b).getPrice());
				} else
					System.out.println("\t" + id + " - Book is not available");
			}
				break;

			case 4: {
				System.out.print("\tEnter Book ID : ");
				int id = sc.nextInt();
				Book b = op.update(id);
				if (b != null) {
					System.out.println("\t1.Update ID\n\t2.Update BookName\n\t3.Update Author Name\n\t4.Update Price");
					System.out.print("\tEnter your choice : ");
					int ch = sc.nextInt();
					switch (ch) {
					case 1: {
						System.out.print("\tEnter Book Id : ");
						int newId = sc.nextInt();
						b.setId(newId);
						System.out.println("\t----ID Updated----");
					}
						break;
					case 2: {
						System.out.print("\tEnter Book Name : ");
						String newBook = sc.next();
						b.setBookName(newBook);
						System.out.println("\t----Book Name Updated----");
					}
						break;

					case 3: {
						System.out.print("\tEnter Author Name : ");
						String author = sc.next();
						b.setAuthor(author);
						System.out.println("\t----Author Name Updated----");
					}
						break;

					case 4: {
						System.out.println("\tEnter Book Price : ");
						double newPrice = sc.nextDouble();
						b.setPrice(newPrice);
						System.out.println("\t----Book Price Updated----");
					}
						break;
					}
				}
			}
				break;

			case 5: {
				System.out.print("\tEnter Book Name : ");
				String name = sc.next();
				op.remove(name);
			}
				break;

			case 6: {
				System.out.println("\tThank you for using this appilcation.......");
				System.exit(0);
			}
			default:
				System.out.println("\tInvalid Choice");
			}*/
		}
	}
}