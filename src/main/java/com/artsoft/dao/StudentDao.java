package com.artsoft.dao;

import com.artsoft.model.Student;

import java.util.List;

public interface StudentDao {
    List<Student> findAllStudents();

    void saveStudent(Student student);
}
