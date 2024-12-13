package com.example.Cricbuzz.controller;

import com.example.Cricbuzz.dto.request.StatsRequest;
import com.example.Cricbuzz.dto.response.StatsResponse;
import com.example.Cricbuzz.service.StatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/stats")
public class StatsController {

    @Autowired
    StatsService statsService;

    @PostMapping
    public StatsResponse addStats(@RequestBody StatsRequest statsRequest,
                                  @RequestParam("player-id") int playerId) {
        return statsService.addStats(statsRequest,playerId);
    }
}
