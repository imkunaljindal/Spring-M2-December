package com.example.Cricbuzz.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Builder
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String name;

    int ranking;

    int iccPoints;

    String coach;

    int matchesPlayed;

    @OneToMany(mappedBy = "team")
    @JsonBackReference
    List<Player> players;

    @ManyToMany(mappedBy = "teams")
    @JsonBackReference
    List<CricketMatch> matches;
}
