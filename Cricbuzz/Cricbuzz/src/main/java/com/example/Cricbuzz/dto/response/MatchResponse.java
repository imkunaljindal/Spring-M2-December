package com.example.Cricbuzz.dto.response;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class MatchResponse {

    String title;

    String venue;

    Date created;

    List<TeamResponse> teams;
}
