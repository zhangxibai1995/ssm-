package com.hh.controller;

import com.hh.model.Student;
import com.hh.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/select",method = RequestMethod.GET)
    public ModelAndView selectStudent(@RequestParam("studentName") String studentName) {
        ModelAndView mv = new ModelAndView();
        Student student = studentService.selectStudent(studentName);
        System.out.println(student.toString());
        mv.setViewName("StudentInfo");
        mv.addObject("Student", student);
        return mv;
    }
}
