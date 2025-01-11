package com.example.studentinformation.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "subject_t")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subject_id")
    private int subjectId;

    @Column(name = "subject_code")
    private String subjectCode;

    @Column(name = "subject_name")
    private String subjectName;

    @Column(name = "credit")
    private int credit;
}
