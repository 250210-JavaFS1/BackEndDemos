package com.revature.P1DemoBackend.mapper;

import com.revature.P1DemoBackend.dto.UserDto;
import com.revature.P1DemoBackend.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel="spring")
public interface UserMapper {
    @Mapping(source="userDto.username",target = "username")
    User userDtoToUser(UserDto userDto);
    @Mapping(source="user.username",target = "username")
    UserDto userToUserDto(User user);
}
