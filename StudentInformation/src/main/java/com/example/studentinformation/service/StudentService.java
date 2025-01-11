package com.example.studentinformation.service;

import com.example.studentinformation.model.Student;

import java.util.List;

public interface StudentService {
    public void addStudent(Student student);

    public void editStudent(Student student);

    void deleteStudent(int id);

    Student getStudent(int id);

    List<Student> getAllStudents();
}
