package org.example.aws_cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/main")
    public String main() {
        return "Hello AWS";
    }
}
