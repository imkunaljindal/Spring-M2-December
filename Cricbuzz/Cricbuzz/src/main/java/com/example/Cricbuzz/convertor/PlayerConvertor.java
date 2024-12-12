package com.example.Cricbuzz.convertor;

import com.example.Cricbuzz.dto.request.PlayerRequest;
import com.example.Cricbuzz.dto.response.PlayerResponse;
import com.example.Cricbuzz.model.Player;

public class PlayerConvertor {

    public static Player playerRequestToPlayer(PlayerRequest playerRequest) {
        return Player.builder()
                .name(playerRequest.getName())
                .age(playerRequest.getAge())
                .speciality(playerRequest.getSpeciality())
                .gender(playerRequest.getGender())
                .build();
    }

    public static PlayerResponse playerToPlayerResponse(Player player) {
        return PlayerResponse.builder()
                .name(player.getName())
                .speciality(player.getSpeciality())
                .build();
    }
}
