package org.example.aws_cicd.repository;

import org.example.aws_cicd.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
