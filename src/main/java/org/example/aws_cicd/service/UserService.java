package org.example.aws_cicd.service;

import lombok.RequiredArgsConstructor;
import org.example.aws_cicd.dto.UserCreateDto;
import org.example.aws_cicd.entity.User;
import org.example.aws_cicd.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<User> getUserList() {
        return userRepository.findAll();
    }

    public User createUser(UserCreateDto userDto) {
        User user = new User();
        user.setUserId(userDto.getUserId());
        user.setPassword(userDto.getPassword());
        user.setEmail(userDto.getEmail());
        user.setName(userDto.getName());
        return userRepository.save(user);
    }
}
