package com.kodilla.bettingappback.apifootball.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiFootballBetDto {

    @JsonProperty ("label_name")
    private String typeOfOdd;

    @JsonProperty ("values")
    private List<ApiFootballBetValueDto> betsValues;
}
