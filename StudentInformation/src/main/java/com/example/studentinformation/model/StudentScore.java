package com.example.studentinformation.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "student_score_t")
public class StudentScore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_score_id")
    private int studentScoreId;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;

    @Column(name = "score1")
    private double score1;

    @Column(name = "score2")
    private double score2;

    public String getGrade() {
        double grade = 0.3 * score1 + 0.7 * score2;
        if (grade >= 8.0) return "A";
        if (grade >= 6.0) return "B";
        if (grade >= 4.0) return "D";
        return "F";
    }
}
