package com.kodilla.bettingappback.apifootball.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ApiFootballBookmakerDto {

    @JsonProperty("bookmaker_id")
    private int id;

    @JsonProperty("bookmaker_name")
    private String name;

    @JsonProperty("bets")
    private List<ApiFootballBetDto> availableBets;
}
