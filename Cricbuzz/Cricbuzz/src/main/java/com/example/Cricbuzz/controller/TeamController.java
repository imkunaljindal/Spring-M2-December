package com.example.Cricbuzz.controller;

import com.example.Cricbuzz.dto.request.TeamRequest;
import com.example.Cricbuzz.dto.response.TeamResponse;
import com.example.Cricbuzz.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/team")
public class TeamController {

    @Autowired
    TeamService teamService;

    @PostMapping
    public ResponseEntity<TeamResponse> addTeam(@RequestBody TeamRequest teamRequest) {
        return new ResponseEntity<>(teamService.addTeam(teamRequest), HttpStatus.CREATED);
    }
}
