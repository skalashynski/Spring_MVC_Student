package com.skalashynski.spring.spring4.dao.impl;

import com.skalashynski.spring.spring4.dao.AbstractDao;
import com.skalashynski.spring.spring4.dao.StudentDao;
import com.skalashynski.spring.spring4.model.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("studentDao")
public class StudentDaoImpl extends AbstractDao<Long, Student> implements StudentDao {

    @Override
    public List<Student> findAllStudents() {
        return createCriteria().list();
    }

    @Override
    public void saveStudent(Student student) {
        persist(student);
    }

    @Override
    public void deleteStudent(Student student) {
        delete(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return getByKey(id);
    }

    @Override
    public void updateStudent(Student student) {
        getSession().update(student);
    }
}
