package com.hh.model;

public class Student {
    private Integer studentId;
    private String studentName;
    private String studentMajor;
    private String studentDept;
    private Integer studentSex;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentMajor() {
        return studentMajor;
    }

    public void setStudentMajor(String studentMajor) {
        this.studentMajor = studentMajor;
    }

    public String getStudentDept() {
        return studentDept;
    }

    public void setStudentDept(String studentDept) {
        this.studentDept = studentDept;
    }

    public Integer getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(Integer studentSex) {
        this.studentSex = studentSex;
    }

    @Override
    public String toString() {
        return " \n姓名："+studentName+" \n性别："+studentSex+"  \n专业："+studentMajor+" \n学院:"+studentDept
                +"\n---------------------------------";
    }
}
