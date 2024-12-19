package com.example.SecurityTutorial.config;

import com.example.SecurityTutorial.model.Person;
import com.example.SecurityTutorial.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    PersonRepository personRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Person person = personRepository.findByUsername(username);
        if(person == null) {
            throw new UsernameNotFoundException("Invalid username");
        }

        return new CustomUserDetails(person);
    }
}
