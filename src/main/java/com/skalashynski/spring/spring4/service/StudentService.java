package com.skalashynski.spring.spring4.service;

import com.skalashynski.spring.spring4.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAllStudents();

    void saveStudent(Student student);

    Student getStudentById(String id);

    void deleteStudent(Student student);
}
