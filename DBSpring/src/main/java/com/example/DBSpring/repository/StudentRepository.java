package com.example.DBSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.DBSpring.model.Student;


public interface StudentRepository extends JpaRepository<Student, Long> {

}
