package org.example.aws_cicd.controller;

import lombok.RequiredArgsConstructor;
import org.example.aws_cicd.dto.UserCreateDto;
import org.example.aws_cicd.dto.UserResponseDto;
import org.example.aws_cicd.entity.User;
import org.example.aws_cicd.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/users")
    public List<UserResponseDto> getUsers() {
        List<UserResponseDto> users = userService.getUserList()
                .stream()
                .map(u -> new UserResponseDto(u.getId(),u.getUserId(), u.getName()))
                .collect(Collectors.toList());
        return users;
    }

    @PostMapping("/users")
    public UserResponseDto createNewUser(@RequestBody UserCreateDto userDto){
        User user = userService.createUser(userDto);
        return new UserResponseDto(user.getId(),user.getUserId(),user.getName());
    }
}
