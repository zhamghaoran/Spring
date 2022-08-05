package com.zhr.springhello;

import java.util.PrimitiveIterator;

public class Student {
    private Integer sid;
    private String sname;
    private Integer age;
    private String gender;

    public Student(Integer sid, String sname, Integer age, String gender) {
        this.sid = sid;
        this.sname = sname;
        this.age = age;
        this.gender = gender;
    }
    public Student(){}

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
