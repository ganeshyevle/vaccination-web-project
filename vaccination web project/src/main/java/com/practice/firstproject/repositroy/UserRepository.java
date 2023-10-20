package com.practice.firstproject.repositroy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.firstproject.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}

