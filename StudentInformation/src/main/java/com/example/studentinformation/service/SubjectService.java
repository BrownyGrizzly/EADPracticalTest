package com.example.studentinformation.service;

import com.example.studentinformation.model.Subject;

import java.util.List;

public interface SubjectService {
    void addSubject(Subject subject);

    void editSubject(Subject subject);

    void deleteSubject(int id);

    Subject getSubject(int id);

    List<Subject> getAllSubjects();
}
