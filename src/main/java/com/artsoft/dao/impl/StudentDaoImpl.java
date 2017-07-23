package com.artsoft.dao.impl;

import com.artsoft.dao.AbstractDao;
import com.artsoft.dao.StudentDao;
import com.artsoft.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("studentDao")
public class StudentDaoImpl extends AbstractDao<Long, Student> implements StudentDao {

    private List<Student> students = new ArrayList() {{
        this.add(new Student("Сергей", "Колошинский"));
        this.add(new Student("Максим", "Колошинский"));
        this.add(new Student("Нина", "Онищук"));
        this.add(new Student("Владимир", "Демчук"));
    }};

    @Override
    public List<Student> findAllStudents() {
        return students;
    }

    @Override
    public void saveStudent(Student student) {
        this.students.add(student);
        //persist(student);
    }
}
