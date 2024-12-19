package com.example.SecurityTutorial.service;

import com.example.SecurityTutorial.model.Person;
import com.example.SecurityTutorial.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public String addPerson(String username, String password) {
        Person person = new Person();
        person.setUsername(username);
        person.setPassword(passwordEncoder.encode(password));
        person.setRoles("ROLE_STUDENT");

        personRepository.save(person);
        return "Person saved successfully";
    }
}
