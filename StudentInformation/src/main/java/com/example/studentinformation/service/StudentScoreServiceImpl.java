package com.example.studentinformation.service;

import com.example.studentinformation.model.StudentScore;
import com.example.studentinformation.repository.StudentScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentScoreServiceImpl implements StudentScoreService {

    @Autowired
    private StudentScoreRepository studentScoreRepository;

    @Override
    public void addStudentScore(StudentScore studentScore) {
        studentScoreRepository.save(studentScore);
    }

    @Override
    public void editStudentScore(StudentScore studentScore) {
        studentScoreRepository.save(studentScore);
    }

    @Override
    public void deleteStudentScore(int id) {
        studentScoreRepository.deleteByStudentScoreId(id);
    }

    @Override
    public StudentScore getStudentScore(int id) {
        return studentScoreRepository.findByStudentScoreId(id);
    }

    @Override
    public List<StudentScore> getAllStudentScores() {
        return studentScoreRepository.findAll();
    }
}

