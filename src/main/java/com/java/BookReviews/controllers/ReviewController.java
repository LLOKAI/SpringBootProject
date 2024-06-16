package com.java.BookReviews.controllers; 

import com.java.BookReviews.data.ReviewRepository; 
import com.java.BookReviews.models.Review; 
import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; 
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.PathVariable; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestParam; 
import org.springframework.web.bind.annotation.RestController; 
import org.springframework.web.servlet.view.RedirectView;

@RestController 
public class ReviewController {

    @Autowired 
    private ReviewRepository reviewRepository; 

    @GetMapping("/reviews/{bookId}") 
    public List<Review> listReviews(@PathVariable("bookId") int bookId) { 
        return reviewRepository.findByBookId(bookId); 
    }

    @PostMapping("/reviews") 
    public RedirectView addReview(@RequestParam("bookId") int bookId, @RequestParam("review") String review, Model model) { 
        Review review1 = new Review(); 
        review1.setBookId(bookId); 
        review1.setReview(review); 
        reviewRepository.save(review1); 
        model.addAttribute("reviews", reviewRepository.findAll()); 
        return new RedirectView("/"); 
    }
    
}
