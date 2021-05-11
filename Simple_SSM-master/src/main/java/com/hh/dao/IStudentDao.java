package com.hh.dao;

import com.hh.model.Student;

public interface IStudentDao {
    Student selectStudent(String studentName);
}
