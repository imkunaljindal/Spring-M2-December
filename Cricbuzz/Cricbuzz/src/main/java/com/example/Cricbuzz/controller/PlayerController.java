package com.example.Cricbuzz.controller;

import com.example.Cricbuzz.dto.request.PlayerRequest;
import com.example.Cricbuzz.dto.response.PlayerResponse;
import com.example.Cricbuzz.exception.PlayerNotFoundException;
import com.example.Cricbuzz.model.Enum.Gender;
import com.example.Cricbuzz.model.Enum.Speciality;
import com.example.Cricbuzz.service.PlayerService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/player")
public class PlayerController {

    @Autowired
    PlayerService playerService;

    @PostMapping
    public PlayerResponse addPlayer(@RequestBody PlayerRequest playerRequest) {
        return playerService.addPlayer(playerRequest);
    }

    @GetMapping("/id/{id}")
    public PlayerResponse getPlayerById(@PathVariable("id") int id) {
        return playerService.getPlayerById(id);
    }

    // gender and age -> MALE, 35  >=35
    @GetMapping("/gender/{gender}/age/{age}")
    public List<PlayerResponse> getByGenderAndAgeGreaterThan(@PathVariable("gender") Gender gender,
                                                             @PathVariable("age") int age) {
        return playerService.getByGenderAndAgeGreaterThan(gender,age);
    }

    // speciality, gender
    @GetMapping("/gender/{gender}/speciality/{speciality}")
    public List<PlayerResponse> getByGenderAndSpeciality(@PathVariable("gender") Gender gender,
                                                         @PathVariable("speciality") Speciality speciality) {
        return playerService.getByGenderAndSpeciality(gender,speciality);
    }
}
