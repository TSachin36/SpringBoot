package com.example.DBSpring.controller;

import com.example.DBSpring.model.Student;
import com.example.DBSpring.service.StudentService;
import com.example.DBSpring.model.Student;
import com.example.DBSpring.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("api/students")

public class StudentController {
	
	private StudentService studentService;
	@Autowired
	    public StudentController(StudentService studentService) {
	        this.studentService = studentService;
	    }
	
	 @PostMapping
	    public ResponseEntity<Student> createStudent(@RequestBody Student student){
	        Student savedStudent = studentService.createStudent(student);
	        return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
	    }
	 
	 @GetMapping("{id}")
	    public ResponseEntity<Student> getStudentById(@PathVariable("id") Long studentId){
	        Student student = studentService.getStudentById(studentId);
	        return new ResponseEntity<>(student, HttpStatus.OK);
	    }
	 
	 @GetMapping
	    public ResponseEntity<List<Student>> getAllStudents(){
	        List<Student> students = studentService.getAllStudents();
	        return new ResponseEntity<>(students, HttpStatus.OK);
	    }
	 
	 public ResponseEntity<Student> updateStudent(@PathVariable("id") Long studentId,
             @RequestBody Student student){
		 	student.setId(studentId);
		 	Student updatedStudent = studentService.updateStudent(student);
		 	return new ResponseEntity<>(updatedStudent, HttpStatus.OK);
	 }
	 
	 @DeleteMapping("{id}")
	    public ResponseEntity<String> deleteStudent(@PathVariable("id") Long studentId){
	        studentService.deleteStudent(studentId);
	        return new ResponseEntity<>("Student successfully deleted!", HttpStatus.OK);
	    }



}
