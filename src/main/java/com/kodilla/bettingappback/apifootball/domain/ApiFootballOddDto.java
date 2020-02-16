package com.kodilla.bettingappback.apifootball.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ApiFootballOddDto {

    @JsonProperty("fixture")
    private ApiFootballFixtureDto fixture;

    @JsonProperty("bookmakers")
    private List<ApiFootballBookmakerDto> bookmakers;
}
