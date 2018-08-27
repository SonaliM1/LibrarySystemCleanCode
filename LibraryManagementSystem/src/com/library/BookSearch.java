package com.library;

import java.util.ArrayList;
import java.util.Scanner;

public class BookSearch {

	public static void main(String[] args) {
		
	ArrayList<String> bookList=new ArrayList<>();
	bookList.add("Scince");
	bookList.add("Math");
	bookList.add("Physics");
	bookList.add("Geo");
	
	bookList.forEach(s->System.out.print(s + " "));

	System.out.println("");
	System.out.println("Enter Book for searching ");
	
	Scanner scan=new Scanner(System.in);
	String book=scan.nextLine();
	
	
	if (bookList.contains(book)) {
		
		System.out.println("The Searched book is available ...");
	}
	else
	{
		System.out.println("Book is not available .");
	}
	
	

}

}