package com.kodilla.bettingappback.apifootball.client;

import com.kodilla.bettingappback.apifootball.config.ApiFootballConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ApiFootballClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(ApiFootballClient.class);

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ApiFootballConfig apiFootballConfig;

}
