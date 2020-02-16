package com.kodilla.bettingappback.mapper;

import com.kodilla.bettingappback.domain.User;
import com.kodilla.bettingappback.domain.UserDto;

public class UserMapper {

    public User mapToUser(final UserDto userDto) {
        return new User(userDto.getId(),userDto.getFirstname(),
                userDto.getLastname(),userDto.getEmail());
    }

    public UserDto mapToUserDto(final User user) {
        return new UserDto(user.getId(),user.getFirstname(),
                user.getLastname(),user.getEmail());
    }
}
