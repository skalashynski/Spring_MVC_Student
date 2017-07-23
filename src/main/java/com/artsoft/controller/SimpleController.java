package com.artsoft.controller;

import com.artsoft.model.Student;
import com.artsoft.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SimpleController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public String getStudents(Model model) {
        model.addAttribute("studentList",studentService.findAllStudents());
        return "/view/students";
    }

    @RequestMapping(value = "add-student", method = RequestMethod.GET)
    public ModelAndView student() {
         return new ModelAndView("view/addStudent", "command", new Student());
    }

    @RequestMapping(value = "add-student", method = RequestMethod.POST)
    public String addStudent(@ModelAttribute("SpringWeb") Student student) {
        studentService.saveStudent(student);
        return "redirect:students";
    }
}
