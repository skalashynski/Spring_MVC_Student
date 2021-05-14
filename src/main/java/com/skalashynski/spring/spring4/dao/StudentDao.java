package com.skalashynski.spring.spring4.dao;

import com.skalashynski.spring.spring4.model.Student;

import java.util.List;

public interface StudentDao {
    List<Student> findAllStudents();

    void saveStudent(Student student);

    void deleteStudent(Student student);

    Student getStudentById(Long id);

    void updateStudent(Student student);
}
