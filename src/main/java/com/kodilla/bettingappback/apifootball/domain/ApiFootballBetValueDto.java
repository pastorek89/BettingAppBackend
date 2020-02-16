package com.kodilla.bettingappback.apifootball.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ApiFootballBetValueDto {

    @JsonProperty("value")
    private String value;

    @JsonProperty("odd")
    private String odd;
}
