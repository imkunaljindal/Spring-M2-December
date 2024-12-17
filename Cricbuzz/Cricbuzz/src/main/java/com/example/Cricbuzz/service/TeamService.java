package com.example.Cricbuzz.service;

import com.example.Cricbuzz.convertor.TeamConvertor;
import com.example.Cricbuzz.dto.request.TeamRequest;
import com.example.Cricbuzz.dto.response.TeamResponse;
import com.example.Cricbuzz.model.Team;
import com.example.Cricbuzz.repository.TeamRepository;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamService {

    @Autowired
    TeamRepository teamRepository;

    public TeamResponse addTeam(TeamRequest teamRequest) {
        Team team = TeamConvertor.teamRequestToTeam(teamRequest);
        Team savedTeam = teamRepository.save(team);
        return TeamConvertor.teamToTeamResponse(savedTeam);
    }
}
