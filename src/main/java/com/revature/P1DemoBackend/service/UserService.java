package com.revature.P1DemoBackend.service;

import com.revature.P1DemoBackend.dto.UserDto;
import com.revature.P1DemoBackend.exception.UserNotFoundException;

import java.util.List;
import java.util.Optional;

public interface UserService {
    Optional<UserDto> registerUser(UserDto userDto);
    Optional<UserDto> login(UserDto userDto) throws UserNotFoundException;
    Optional<List<UserDto>> getAllUsers();
    void deleteUser(Long userId) throws UserNotFoundException;
    Optional<UserDto> updateUserPartially(UserDto userDto) throws UserNotFoundException;

}
