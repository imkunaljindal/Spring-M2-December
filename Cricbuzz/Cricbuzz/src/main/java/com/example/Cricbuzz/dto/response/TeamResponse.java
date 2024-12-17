package com.example.Cricbuzz.dto.response;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class TeamResponse {

    String name;

    int ranking;

    String coach;
}
