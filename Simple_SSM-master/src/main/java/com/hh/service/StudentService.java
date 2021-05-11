package com.hh.service;

import com.hh.model.Student;

public interface StudentService {
    /**
     * 根据名字查询一个用户
     * @param studentName
     * @return Student
     */
    public Student selectStudent(String studentName);
}
