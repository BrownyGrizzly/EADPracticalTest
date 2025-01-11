package com.example.studentinformation.controller;

import com.example.studentinformation.model.StudentScore;
import com.example.studentinformation.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/scores")
public class ScoreController {

    @Autowired
    private StudentService studentService;

    // Add score for a student
    @PostMapping
    public ResponseEntity<StudentScore> addScore(@RequestBody StudentScore score) {
        studentService.addScore(score);
        return new ResponseEntity<>(score, HttpStatus.CREATED);
    }
}