package com.artsoft.dao;

import com.artsoft.model.Student;

import java.util.List;

public interface StudentDao {
    List<Student> findAllStudents();

    void saveStudent(Student student);

    void deleteStudent(Student student);

    Student getStudentById(Long id);

    void updateStudent(Student student);
}
