package com.ly.tools.entity;

import lombok.Data;

import java.util.ArrayList;

public class Classes {
    private String ClassId;
    private String ClassName;

    @Override
    public String toString() {
        return "Classes{" +
                "ClassId='" + ClassId + '\'' +
                ", ClassName='" + ClassName + '\'' +
                ", students=" + students +
                '}';
    }

    public Classes() {
    }

    public Classes(String classId, String className, ArrayList<Student> students) {
        ClassId = classId;
        ClassName = className;
        this.students = students;
    }

    public String getClassId() {
        return ClassId;
    }

    public void setClassId(String classId) {
        ClassId = classId;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String className) {
        ClassName = className;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    private ArrayList<Student> students;
}
