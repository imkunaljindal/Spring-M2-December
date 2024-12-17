package com.example.Cricbuzz.convertor;

import com.example.Cricbuzz.dto.request.TeamRequest;
import com.example.Cricbuzz.dto.response.TeamResponse;
import com.example.Cricbuzz.model.Team;

public class TeamConvertor {

    public static Team teamRequestToTeam(TeamRequest teamRequest) {
        return Team.builder()
                .name(teamRequest.getName())
                .ranking(teamRequest.getRanking())
                .iccPoints(teamRequest.getIccPoints())
                .coach(teamRequest.getCoach())
                .matchesPlayed(0)
                .build();
    }

    public static TeamResponse teamToTeamResponse(Team team) {
        return TeamResponse.builder()
                .name(team.getName())
                .ranking(team.getRanking())
                .coach(team.getCoach())
                .build();
    }
}
