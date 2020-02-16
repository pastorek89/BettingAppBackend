package com.kodilla.bettingappback.apifootball.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ApiFootballAllOddsDto {

    @JsonProperty("odds")
    private List<ApiFootballOddDto> odds;
}
