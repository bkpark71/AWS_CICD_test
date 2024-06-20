package org.example.aws_cicd.service;

import org.assertj.core.api.Assertions;
import org.example.aws_cicd.dto.UserCreateDto;
import org.example.aws_cicd.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class UserServiceTest {
    @Autowired
    UserService userService;

    @Test
    void 사용자생성테스트(){
        //given
        UserCreateDto userDto = new UserCreateDto("aaa", "1111", "홍길동", "a@naver.com");
        //when
        User user = userService.createUser(userDto);
        //then
        assertThat(user.getId()).isGreaterThan(0);
    }
}