package com.lab;
/*Problem 3. 
Program to create library book Management system
to store and display book details in library where you can 
create two classes one is main another one is library, where you can 
create two methods as addBook,dispanseBook and 
bookId,bookName,bookAuthor as instance variables*/

class Library {
	// instance variables
	int bookId;
	String bookName;
	String bookAuthor;
	// method
	void addBook(int bookId,String bookName,String bookAuthor ) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
	}
	// method 
	void dispanseBook (String booksname) {
		if(booksname.equals(bookName)  ) {
			System.out.println("Book ID: "+ bookId+" "+"Book Name: "+bookName+" "+"Book Authour: "+bookAuthor);
		}
		else {
			System.out.println("Book not found in the Lybrary");
		}
	}
}
public class MainLibrary {
public static void main(String [] args) {
	Library l1 = new Library();
	Library l2 = new Library();
	Library l3 = new Library();
	
	l1.addBook(101,"HTML & CSS" , "Mr. X");
	l2.addBook(101,"JAVA" , "Mr. Y");
	l3.addBook(101,"PYTHON" , "Mr. Z");
	
	l1.dispanseBook("HTML");
	l2.dispanseBook("JAVA");
	l3.dispanseBook("PYTHON");
}
}
