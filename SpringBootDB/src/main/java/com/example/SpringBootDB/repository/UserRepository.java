package com.example.SpringBootDB.repository;

import com.example.SpringBootDB.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}