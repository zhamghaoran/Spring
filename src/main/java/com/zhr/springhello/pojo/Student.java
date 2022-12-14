package com.zhr.springhello.pojo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.PrimitiveIterator;

public class Student {
    private Integer sid;
    private String sname;
    private Integer age;
    private String gender;
    private Class aClass;
    private Map<String,Teacher> teacherMap;

    public Student(Integer sid, String sname, Integer age, String gender, Class aClass, Map<String, Teacher> teacherMap, String[] hobby) {
        this.sid = sid;
        this.sname = sname;
        this.age = age;
        this.gender = gender;
        this.aClass = aClass;
        this.teacherMap = teacherMap;
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", aClass=" + aClass +
                ", teacherMap=" + teacherMap +
                ", hobby=" + Arrays.toString(hobby) +
                '}';
    }

    public Map<String, Teacher> getTeacherMap() {
        return teacherMap;
    }

    public void setTeacherMap(Map<String, Teacher> teacherMap) {
        this.teacherMap = teacherMap;
    }

    public Student(Integer sid, String sname, Integer age, String gender, Class aClass, String[] hobby) {
        this.sid = sid;
        this.sname = sname;
        this.age = age;
        this.gender = gender;
        this.aClass = aClass;
        this.hobby = hobby;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    private String[] hobby;

    public Class getaClass() {
        return aClass;
    }

    public void setaClass(Class aClass) {
        this.aClass = aClass;
    }

    public Student(Integer sid, String sname, Integer age, String gender) {
        this.sid = sid;
        this.sname = sname;
        this.age = age;
        this.gender = gender;
    }
    public Student(){}

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
