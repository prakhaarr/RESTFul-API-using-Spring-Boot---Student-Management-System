package com.pg.restapi.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.pg.restapi.entity.Student;
import com.pg.restapi.repository.StudentRepository;

@RestController
public class StudentController {
	
	@Autowired
	StudentRepository repo;
	
	

	
	//get all the students
	//localhost:8080/students 
	
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		List<Student> students = repo.findAll();
	
		return students;
	}
	
	@GetMapping("/students/{id}")
	public Student getStudent(@PathVariable int id) {
		Student student = repo.findById(id).get();
		
		return student; 
	}
	
	@PostMapping("/student/add")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void createStudent(@RequestBody Student student) {
		repo.save(student);
		 
	}
	
	@PutMapping("student/update/{id}") 
	public Student updateStudent(@PathVariable int id) {
		Student student = repo.findById(id).get();
		student.setName("M Aditya");
		student.setPercentage(78);
		repo.save(student);
		return null;
	}
	
	@DeleteMapping("student/delete/{id}")
	public void removeStudent(@PathVariable int id) {
		Student stduent = repo.findById(id).get();
		repo.delete(stduent);
		
		
	}
	
	
	

}
