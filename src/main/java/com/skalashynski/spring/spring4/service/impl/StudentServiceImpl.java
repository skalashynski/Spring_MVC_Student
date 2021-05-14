package com.skalashynski.spring.spring4.service.impl;

import com.skalashynski.spring.spring4.dao.StudentDao;
import com.skalashynski.spring.spring4.model.Student;
import com.skalashynski.spring.spring4.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("studentService")
@Transactional
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Student> findAllStudents() {
        return studentDao.findAllStudents();
    }

    @Override
    public void saveStudent(Student student) {
        studentDao.saveStudent(student);
    }

    @Override
    public Student getStudentById(String id) {
        Student student = studentDao.getStudentById(Long.valueOf(id));
        return student;
    }

    @Override
    public void deleteStudent(Student student) {
        studentDao.deleteStudent(student);
    }
}
