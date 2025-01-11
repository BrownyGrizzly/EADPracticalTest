package com.example.studentinformation.repository;

import com.example.studentinformation.model.StudentScore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentScoreRepository extends JpaRepository<StudentScore, Integer> {
    void deleteByStudentScoreId(int id);
    StudentScore findByStudentScoreId(int id);
}
