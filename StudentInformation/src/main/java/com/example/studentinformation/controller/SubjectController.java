package com.example.studentinformation.controller;

import com.example.studentinformation.model.Subject;
import com.example.studentinformation.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subjects")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @PostMapping
    public void addSubject(@RequestBody Subject subject) {
        subjectService.addSubject(subject);
    }

    @PutMapping("/{id}")
    public void editSubject(@PathVariable int id, @RequestBody Subject subject) {
        subjectService.editSubject(subject);
    }

    @DeleteMapping("/{id}")
    public void deleteSubject(@PathVariable int id) {
        subjectService.deleteSubject(id);
    }

    @GetMapping("/{id}")
    public Subject getSubject(@PathVariable int id) {
        return subjectService.getSubject(id);
    }

    @GetMapping
    public List<Subject> getAllSubjects() {
        return subjectService.getAllSubjects();
    }
}
