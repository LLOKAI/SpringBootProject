package com.java.BookReviews.security; 

import com.java.BookReviews.data.UserDetailsRepository; 
import com.java.BookReviews.security.MyUserDetails; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.security.core.userdetails.UserDetails; 
import org.springframework.security.core.userdetails.UserDetailsService; 
import org.springframework.security.core.userdetails.UsernameNotFoundException; 

public class UserDetailsServicesImpl implements UserDetailsService { 

    @Autowired 
    private UserDetailsRepository userDetailsRepository; 

    @Override 
    public UserDetails loadUserByUsername(String username) 
            throws UsernameNotFoundException { 

        MyUserDetails mud = userDetailsRepository.findUserByUsername(username); 

        if (mud == null) 
            throw new UsernameNotFoundException("User not found"); 

        return mud; 
    }
}
