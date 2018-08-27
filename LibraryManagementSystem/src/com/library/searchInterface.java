package com.library;

import java.util.ArrayList;
import java.util.Scanner;

@FunctionalInterface
interface search{
	public String showBook(String book);
}
public class searchInterface implements search {

	static ArrayList<String> bookList=new ArrayList<>();
	
	@Override
	public String showBook(String book) {
		// TODO Auto-generated method stub
		if (bookList.contains(book)) {
			
			System.out.println("The Searched book "+ book +"is available ..." );
		}
		else
			System.out.println("The Book "+ book +" is not available.");
		
		return book;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		bookList.add("Scince");
		bookList.add("Math");
		bookList.add("Physics");
		bookList.add("Geo");
		
		bookList.forEach(s->System.out.print(s + " "));

		System.out.println("");
		System.out.println("Enter Book Title  For Search : ");
		Scanner scan=new Scanner(System.in);
		String book=scan.nextLine();
		
		searchInterface sI=new searchInterface();
		sI.showBook(book);
		
		/*searchInterface sI=(String book) ->("The book is available");*/
	}


}
