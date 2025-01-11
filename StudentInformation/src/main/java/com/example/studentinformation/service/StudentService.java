package com.example.studentinformation.service;

import com.example.studentinformation.model.Student;
import com.example.studentinformation.model.StudentScore;
import com.example.studentinformation.model.Subject;
import com.example.studentinformation.repository.StudentRepository;
import com.example.studentinformation.repository.StudentScoreRepository;
import com.example.studentinformation.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private SubjectRepository subjectRepository;

    @Autowired
    private StudentScoreRepository scoreRepository;

    // Get all students
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // Add new student
    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    // Add score for a student
    public void addScore(StudentScore score) {
        scoreRepository.save(score);
    }

    // Get scores for a student
    public List<StudentScore> getScoresForStudent(Long studentId) {
        return scoreRepository.findByStudentId(studentId);
    }

    // Get all subjects
    public List<Subject> getAllSubjects() {
        return subjectRepository.findAll();
    }
}
