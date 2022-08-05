package com.zhr.springhello.pojo;

import java.util.List;

public class Class {
    private Integer cid;
    private String cname;

    private List<Student> students;

    @Override
    public String toString() {
        return "Class{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", students=" + students +
                '}';
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Class(Integer cid, String cname) {
        this.cid = cid;
        this.cname = cname;
    }
    public Class(){}

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
