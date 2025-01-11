package com.example.studentinformation.service;

import com.example.studentinformation.model.Subject;
import com.example.studentinformation.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    @Override
    public void addSubject(Subject subject) {
        subjectRepository.save(subject);
    }

    @Override
    public void editSubject(Subject subject) {
        subjectRepository.save(subject);
    }

    @Override
    public void deleteSubject(int id) {
        subjectRepository.deleteBySubjectId(id);
    }

    @Override
    public Subject getSubject(int id) {
        return subjectRepository.findBySubjectId(id);
    }

    @Override
    public List<Subject> getAllSubjects() {
        return subjectRepository.findAll();
    }
}

