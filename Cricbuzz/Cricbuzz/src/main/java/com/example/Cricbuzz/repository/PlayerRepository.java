package com.example.Cricbuzz.repository;

import com.example.Cricbuzz.model.Enum.Gender;
import com.example.Cricbuzz.model.Enum.Speciality;
import com.example.Cricbuzz.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PlayerRepository extends JpaRepository<Player,Integer> {

    List<Player> findByGenderAndAgeGreaterThanEqual(Gender gender, int age);

    @Query(value = "select p from Player p where p.gender = :gender AND p.speciality = :speciality")
    List<Player> getByGenderAndSpeciality(Gender gender, Speciality speciality);
}
