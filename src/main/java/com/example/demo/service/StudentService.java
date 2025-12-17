package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import com.example.demo.entity.StudentEntity;

public interface StudentService {
    Student insertStudent(StudentEntity st);
    List<Student> getAllStudents();
    StudentEntity updatedata(int id,StudentEntity std);
    String delData(int id);
}