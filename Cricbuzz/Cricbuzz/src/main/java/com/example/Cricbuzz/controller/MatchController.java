package com.example.Cricbuzz.controller;

import com.example.Cricbuzz.dto.request.MatchRequest;
import com.example.Cricbuzz.exception.TeamNotFoundException;
import com.example.Cricbuzz.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/match")
public class MatchController {

    @Autowired
    MatchService matchService;

    @PostMapping
    public ResponseEntity registerMatch(@RequestBody MatchRequest matchRequest,
                                        @RequestParam("teamA-id") int teamAId,
                                        @RequestParam("teamB-id") int teamBId) {
        try {
            return new ResponseEntity<>(matchService.registerMatch(matchRequest,teamAId,teamBId), HttpStatus.CREATED);
        }
        catch (TeamNotFoundException e) {
            return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
        }
    }
}
