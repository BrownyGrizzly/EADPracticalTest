package com.example.studentinformation.controller;

import com.example.studentinformation.model.Student;
import com.example.studentinformation.model.StudentScore;
import com.example.studentinformation.model.Subject;
import com.example.studentinformation.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // Get all students
    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    // Add new student
    @PostMapping
    public ResponseEntity<Student> addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }

    // Get scores for a specific student
    @GetMapping("/{studentId}/scores")
    public List<StudentScore> getScoresForStudent(@PathVariable Long studentId) {
        return studentService.getScoresForStudent(studentId);
    }

    // Add score for a student
    @PostMapping("/{studentId}/scores")
    public ResponseEntity<StudentScore> addScore(@PathVariable Long studentId, @RequestBody StudentScore score) {
        score.setStudent(new Student(studentId));
        studentService.addScore(score);
        return new ResponseEntity<>(score, HttpStatus.CREATED);
    }

    // Get all subjects
    @GetMapping("/subjects")
    public List<Subject> getAllSubjects() {
        return studentService.getAllSubjects();
    }
}
