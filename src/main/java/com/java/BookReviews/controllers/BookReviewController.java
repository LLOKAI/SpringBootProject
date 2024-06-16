package com.java.BookReviews.controllers; 

import com.java.BookReviews.data.BookRepository; 
import com.java.BookReviews.data.ReviewRepository; 
import com.java.BookReviews.data.UserDetailsRepository; 
import com.java.BookReviews.models.Book; 
import com.java.BookReviews.models.Review; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Controller; 
import org.springframework.ui.Model; 
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.RequestParam; 

@Controller 
public class BookReviewController {
    
    @Autowired 
    BookRepository bookRepository; 

    @Autowired 
    ReviewRepository reviewRepository; 

    @Autowired 
    UserDetailsRepository userDetailsRepository; 

    @GetMapping("/") 
    public String index(Model model) { 
        model.addAttribute("books", bookRepository.findAll()); 
        return "index"; 
    }
    
    @GetMapping("/addBook") 
    public String addBook(Model model) { 
        model.addAttribute("book", new Book()); 
        return "addBook"; 
    }
    
    @GetMapping("/addReview") 
    public String addReview(@RequestParam("bookId") int bookId, Model model) { 
        Review review = new Review(); 
        review.setBookId(bookId); 
        model.addAttribute("review", review); 
        return "addReview"; 
    }
}

