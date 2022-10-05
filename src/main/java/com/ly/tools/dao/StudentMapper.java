package com.ly.tools.dao;

import com.ly.tools.entity.Student;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;
import java.util.List;

public interface StudentMapper  {
    @Select("select * from student where classId=#{id}")
    ArrayList<Student> findAllStudents(int id);
}
