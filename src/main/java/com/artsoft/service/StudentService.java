package com.artsoft.service;

import com.artsoft.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAllStudents();

    void saveStudent(Student student);
}
