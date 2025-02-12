package com.revature.P1DemoBackend.service.implementation;

import com.revature.P1DemoBackend.dto.UserDto;
import com.revature.P1DemoBackend.exception.UserNotFoundException;
import com.revature.P1DemoBackend.service.UserService;

import java.util.List;
import java.util.Optional;

public class UserServiceImplementation implements UserService {
    @Override
    public Optional<UserDto> registerUser(UserDto userDto) {
        return Optional.empty();
    }

    @Override
    public Optional<UserDto> login(UserDto userDto) throws UserNotFoundException {
        return Optional.empty();
    }

    @Override
    public Optional<List<UserDto>> getAllUsers() {
        return Optional.empty();
    }

    @Override
    public void deleteUser(Long userId) throws UserNotFoundException {

    }

    @Override
    public Optional<UserDto> updateUserPartially(UserDto userDto) throws UserNotFoundException {
        return Optional.empty();
    }
}
