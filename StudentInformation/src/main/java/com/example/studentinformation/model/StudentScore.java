package com.example.studentinformation.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "student_score_t")
public class StudentScore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_score_id")
    @JsonProperty("student_score_id")
    private int studentScoreId;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "student_id", nullable = false)
    @JsonProperty("student")
    private Student student;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "subject_id", nullable = false)
    @JsonProperty("subject")
    private Subject subject;

    @Column(name = "score1", nullable = false)
    @JsonProperty("score1")
    private double score1;

    @Column(name = "score2", nullable = false)
    @JsonProperty("score2")
    private double score2;

    public String getGrade() {
        double grade = 0.3 * score1 + 0.7 * score2;
        if (grade >= 8.0) return "A";
        if (grade >= 6.0) return "B";
        if (grade >= 4.0) return "D";
        return "F";
    }
}
