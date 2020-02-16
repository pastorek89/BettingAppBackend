package com.kodilla.bettingappback.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class UserDto {

    private Long id;
    private String firstname;
    private String lastname;
    private String email;
}
