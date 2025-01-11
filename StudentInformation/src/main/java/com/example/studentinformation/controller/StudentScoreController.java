package com.example.studentinformation.controller;

import com.example.studentinformation.model.StudentScore;
import com.example.studentinformation.service.StudentScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/scores")
public class StudentScoreController {

    @Autowired
    private StudentScoreService studentScoreService;

    @PostMapping
    public void addStudentScore(@RequestBody StudentScore studentScore) {
        studentScoreService.addStudentScore(studentScore);
    }

    @PutMapping("/{id}")
    public void editStudentScore(@PathVariable int id, @RequestBody StudentScore studentScore) {
        studentScoreService.editStudentScore(studentScore);
    }

    @DeleteMapping("/{id}")
    public void deleteStudentScore(@PathVariable int id) {
        studentScoreService.deleteStudentScore(id);
    }

    @GetMapping("/{id}")
    public StudentScore getStudentScore(@PathVariable int id) {
        return studentScoreService.getStudentScore(id);
    }

    @GetMapping
    public List<StudentScore> getAllStudentScores() {
        return studentScoreService.getAllStudentScores();
    }
}
