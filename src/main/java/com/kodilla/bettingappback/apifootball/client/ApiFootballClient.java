package com.kodilla.bettingappback.apifootball.client;

import com.kodilla.bettingappback.apifootball.config.ApiFootballConfig;
import com.kodilla.bettingappback.apifootball.domain.ApiFootballAllOddsDto;
import com.kodilla.bettingappback.apifootball.domain.ApiFootballOddDto;
import java.net.URI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Component
public class ApiFootballClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(ApiFootballClient.class);

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ApiFootballConfig apiFootballConfig;

    public ApiFootballAllOddsDto getOddsFromPolishLeague() {
        URI url = UriComponentsBuilder.fromHttpUrl("https://api-football-v1.p.rapidapi.com/v2/odds/league/517/label/1")
                .build()
                .encode()
                .toUri();

        HttpHeaders headers = new HttpHeaders();
        headers.set("x-rapidapi-host", apiFootballConfig.getApiFootballHost());
        headers.set("x-rapidapi-key", apiFootballConfig.getApiFootballKey());

        HttpEntity<Object> entity = new HttpEntity(headers);

        ResponseEntity<ApiFootballAllOddsDto> response = restTemplate.exchange(
                url, HttpMethod.GET, entity, ApiFootballAllOddsDto.class);
        return response.getBody();
    }
}
/*TODO -  Opakować w try catch, obsłużyć jak zwróci obiekt z pustą listą, przenieść headery i url do osobnych metod,
*         Zrobić klasy domain, mappery, repository z CRUD, service. Fasada? */
