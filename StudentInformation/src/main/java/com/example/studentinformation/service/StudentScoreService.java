package com.example.studentinformation.service;

import com.example.studentinformation.model.StudentScore;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentScoreService {
    void addStudentScore(StudentScore studentScore);

    void editStudentScore(StudentScore studentScore);

    void deleteStudentScore(int id);

    StudentScore getStudentScore(int id);

    List<StudentScore> getAllStudentScores();
}

