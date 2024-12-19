package com.example.SecurityTutorial.controller;

import com.example.SecurityTutorial.model.Person;
import com.example.SecurityTutorial.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping("/home")
    public String home() {
        return "Welcome to HOME page";
    }

    @GetMapping("/student")
    public String student() {
        return "Welcome to STUDENT page";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Welcome to ADMIN page";
    }

    @PostMapping("/person")
    public ResponseEntity addPerson(@RequestParam("username") String username,
                                     @RequestParam("password") String password) {
        return new ResponseEntity<>(personService.addPerson(username,password),
                HttpStatus.CREATED);
    }
}
