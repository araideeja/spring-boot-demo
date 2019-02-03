package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class Books {
	List<Book> bookList;

	public List<Book> getBookList() {
		if(null== bookList) {
			bookList = new ArrayList<>();
		}
		return bookList;
	}
}
