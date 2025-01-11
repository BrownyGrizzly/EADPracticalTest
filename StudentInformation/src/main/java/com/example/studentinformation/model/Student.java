package com.example.studentinformation.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "student_t")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    @JsonProperty("studentId")
    private int studentId;

    @Column(name = "student_code")
    @JsonProperty("studentCode")
    private String studentCode;

    @Column(name = "full_name")
    @JsonProperty("fullName")
    private String fullName;

    @Column(name = "address")
    @JsonProperty("address")
    private String address;
}
