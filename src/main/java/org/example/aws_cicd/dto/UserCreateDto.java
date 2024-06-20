package org.example.aws_cicd.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserCreateDto {
    private String userId;
    private String password;
    private String name;
    private String email;
}
