package com.example.studentinformation.service;

import com.example.studentinformation.model.Student;
import com.example.studentinformation.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void editStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void deleteStudent(int id) {
        studentRepository.deleteByStudentId(id);
    }

    @Override
    public Student getStudent(int id) {
        return studentRepository.findByStudentId(id);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
