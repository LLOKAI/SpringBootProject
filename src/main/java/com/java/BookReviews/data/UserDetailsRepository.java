package com.java.BookReviews.data; 

import com.java.BookReviews.security.MyUserDetails; 
import org.springframework.data.repository.CrudRepository; 

public interface UserDetailsRepository extends CrudRepository<MyUserDetails, Integer> { 

    public MyUserDetails findByUsername(String username); 

    public MyUserDetails findUserByUsername(String username); 

}
