package com.kodilla.bettingappback.controller;

import com.kodilla.bettingappback.apifootball.client.ApiFootballClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/apifootball")
public class ApiFootballController {

    @Autowired
    private ApiFootballClient apiFootballClient;

    @GetMapping(value = "/getOddsPolishLeague")
    public void getOddsFromPolishLeague() {

    }
}
