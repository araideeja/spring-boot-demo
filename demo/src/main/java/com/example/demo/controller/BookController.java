package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.BookDAO;
import com.example.demo.model.Book;
import com.example.demo.model.Books;

@RestController
@RequestMapping("/books")
public class BookController {
	@Autowired
	private BookDAO bookDao;

	//@RequestMapping(method=RequestMethod.GET, path="/books", produces ="application/json")
	@GetMapping
	public Books getBooks() {
		return bookDao.getAllBooks();
	}
	
	
	//@RequestMapping(method=RequestMethod.POST, path="/books", consumes="application/json", produces="application/json")
	@PostMapping
	public Book addBook(@RequestBody Book book) {
		Integer id = bookDao.getAllBooks().getBookList().size() + 1;
		book.setId(id);
		bookDao.addBook(book);
		return book;
	}

}
