package com.example.DBSpring.service;

import com.example.DBSpring.model.Student;
import com.example.DBSpring.repository.StudentRepository;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service

public class StudentServiceImpl implements StudentService{
	 private StudentRepository studentRepository;
	 @Autowired
	     public StudentServiceImpl(StudentRepository studentRepository) {
	         this.studentRepository = studentRepository;
	     }

	     @Override
	     public Student createStudent(Student student) {
	         return studentRepository.save(student);
	     }

	     @Override
	     public Student getStudentById(Long studentId) {
	         Optional<Student> optionalStudent = studentRepository.findById(studentId);
	         return optionalStudent.get();
	     }

	     @Override
	     public List<Student> getAllStudents() {
	         return studentRepository.findAll();
	     }

	     @Override
	     public Student updateStudent(Student student) {
	         Student existingStudent = studentRepository.findById(student.getId()).get();
	         existingStudent.setFirstName(student.getFirstName());
	         existingStudent.setLastName(student.getLastName());
	         existingStudent.setCollegeName(student.getCollegeName());
	         existingStudent.setBranch(student.getBranch());
	         existingStudent.setSemester(student.getSemester());
	         existingStudent.setEmail(student.getEmail());
	         Student updatedStudent = studentRepository.save(existingStudent);
	         return updatedStudent;
	     }

	     @Override
	     public void deleteStudent(Long studentId) {
	         studentRepository.deleteById(studentId);
	     }
	 }


