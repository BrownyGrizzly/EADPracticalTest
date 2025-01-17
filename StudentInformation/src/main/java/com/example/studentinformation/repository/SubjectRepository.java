package com.example.studentinformation.repository;

import com.example.studentinformation.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Integer> {
    void deleteBySubjectId(int id);
    Subject findBySubjectId(int id);
}
