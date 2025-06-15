package com.java.SpringDataJPAProject.dao;

import org.springframework.data.repository.CrudRepository;

import com.java.SpringDataJPAProject.model.Student;

public interface IStudentRepo extends CrudRepository<Student, Integer> {

}
