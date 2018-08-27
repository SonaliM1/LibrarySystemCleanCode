package com.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@FunctionalInterface
interface searchB{
	void searchBook(int bookId);
}
public class SearchBook implements searchB  {
	static List<Book> bookList1 =new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Book b1=new Book(1, "Computer Science");
		Book b2=new Book(2, "Electronics");
		Book b3=new Book(3, "Statistics");
		bookList1.add(b1);
		bookList1.add(b2);
		bookList1.add(b3);
		
		bookList1.forEach(s->System.out.print(s + " "));
		System.out.println();
			
	}

	@Override
	public void searchBook(int bookId) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int id=scan.nextInt();
		bookList1.stream().filter(n->n.getBookId()==id).forEach(System.out::println);
		//bookList1.stream().filter(n->n.getBookId()=bookId).forEach(System.out::println);
	
		
	}

}
