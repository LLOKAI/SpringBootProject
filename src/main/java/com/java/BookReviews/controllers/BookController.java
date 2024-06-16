package com.java.BookReviews.controllers; 

import com.java.BookReviews.data.BookRepository; 
import com.java.BookReviews.models.Book; 
import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Controller; 
import org.springframework.ui.Model; 
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.PathVariable; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import org.springframework.web.bind.annotation.RequestParam; 
import org.springframework.web.bind.annotation.RestController; 
import org.springframework.web.servlet.view.RedirectView;

@RestController 
public class BookController {

    @Autowired 
    private BookRepository bookRepository; 

    @GetMapping("/books") 
    public List<Book> listBooks() { 
        return (List<Book>) bookRepository.findAll(); 
    }

    @GetMapping("/books/{id}") 
    public Book getBook(@PathVariable("id") int id) { 
        return bookRepository.findById(id).orElse(null); 
    }

    @PostMapping("/books") 
    public RedirectView addBook(@RequestParam("title") String title, @RequestParam("authors") String authors, Model model) { 
        Book book = new Book(); 
        book.setTitle(title); 
        book.setAuthors(authors); 
        bookRepository.save(book); 
        model.addAttribute("books", bookRepository.findAll()); 
        return new RedirectView("/"); 
    }
    
}
