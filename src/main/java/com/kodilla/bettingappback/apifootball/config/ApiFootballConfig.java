package com.kodilla.bettingappback.apifootball.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class ApiFootballConfig {

    @Value("$football.api.endpoint.prod")
    private String apiFootballEndpoint;

    @Value("$football.api.host")
    private String apiFootballHost;

    @Value("$football.api.key")
    private String apiFootballKey;
}
