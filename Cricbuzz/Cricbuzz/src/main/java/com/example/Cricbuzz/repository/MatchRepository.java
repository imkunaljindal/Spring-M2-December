package com.example.Cricbuzz.repository;

import com.example.Cricbuzz.model.CricketMatch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchRepository extends JpaRepository<CricketMatch,Integer> {
}
