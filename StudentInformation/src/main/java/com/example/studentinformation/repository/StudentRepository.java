package com.example.studentinformation.repository;

import com.example.studentinformation.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    void deleteByStudentId(int id);
    Student findByStudentId(int id);
}
