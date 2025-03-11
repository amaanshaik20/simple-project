package com;

import com.model.Book;

public class App {
	public static void main(String[] args) {
		Book book=new Book();
		book.setAuthor("Amaan");
		book.setTitle("Amaan's Life");
		
		System.out.println(book);
	}
}
