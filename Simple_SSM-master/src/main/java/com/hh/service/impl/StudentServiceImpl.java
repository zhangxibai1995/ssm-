package com.hh.service.impl;

import com.hh.dao.IStudentDao;
import com.hh.model.Student;
import com.hh.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Resource
    private IStudentDao studentDao;
    @Override
    public Student selectStudent(String studentName) {
        return studentDao.selectStudent(studentName);
    }
}
