package com.example.Bookstore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.Bookstore.domain.BookRepository;
import com.example.Bookstore.domain.Category;
import com.example.Bookstore.domain.CategoryRepository;
import com.example.Bookstore.domain.Book;

@SpringBootApplication
public class BookstoreApplication {

	private static final Logger log = LoggerFactory.getLogger(BookstoreApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(BookRepository brepository, CategoryRepository crepository) {
		return (args) -> {
			
			log.info("Save a couple of categories and books");
			crepository.save(new Category("Novel"));
			crepository.save(new Category("Detective"));
			crepository.save(new Category("Fantasy"));
		
			brepository.save(new Book("War and Peace", "Leo Tolstoy", "1867", "9781566190274", "8.48", crepository.findByName("Novel").get(0)));
			brepository.save(new Book("The Adventures of Sherlock Holmes", "Arthur Conan Doyle", "1987", "9780895772770",
					"9.98", crepository.findByName("Detective").get(0)));

			log.info("fetch all books");
			for (Book book : brepository.findAll()) {
				log.info(book.toString());
			}
		};
	}

}
