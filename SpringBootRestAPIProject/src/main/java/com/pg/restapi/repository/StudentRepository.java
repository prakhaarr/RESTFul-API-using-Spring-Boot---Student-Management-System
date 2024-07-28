package com.pg.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pg.restapi.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
