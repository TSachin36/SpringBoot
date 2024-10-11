package com.example.DBSpring.service;

import java.util.List;

import com.example.DBSpring.model.Student;



public interface StudentService {
	
	Student createStudent(Student student);

    Student getStudentById(Long studentId);

    List<Student> getAllStudents();

    Student updateStudent(Student student);

    void deleteStudent(Long studentId);

}
