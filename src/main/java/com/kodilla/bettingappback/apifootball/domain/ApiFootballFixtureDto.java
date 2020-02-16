package com.kodilla.bettingappback.apifootball.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ApiFootballFixtureDto {

    @JsonProperty("league_id")
    private int leagueId;

    @JsonProperty("fixture_id")
    private int fixtureId;

    @JsonProperty("updateAt")
    private int updateAt;
}
