package com.example.studentinformation.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "subject_t")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subject_id")
    @JsonProperty("subject_id")
    private int subjectId;

    @Column(name = "subject_code", nullable = false, unique = true)
    @JsonProperty("subject_code")
    private String subjectCode;

    @Column(name = "subject_name", nullable = false)
    @JsonProperty("subject_name")
    private String subjectName;

    @Column(name = "credit", nullable = false)
    @JsonProperty("credit")
    private int credit;
}
