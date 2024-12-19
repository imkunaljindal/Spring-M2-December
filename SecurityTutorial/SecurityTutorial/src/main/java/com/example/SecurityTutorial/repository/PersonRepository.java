package com.example.SecurityTutorial.repository;

import com.example.SecurityTutorial.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Integer> {

    Person findByUsername(String username);
}
