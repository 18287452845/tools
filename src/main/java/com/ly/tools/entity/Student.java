package com.ly.tools.entity;

public class Student {
    private String sname;
    private String sid;
    private int age;

    public Student(String sname, String sid, int age, String classId) {
        this.sname = sname;
        this.sid = sid;
        this.age = age;
        this.classId = classId;
    }

    public Student() {
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    private String classId;
}
