package com.example.studentinformation.controller;

import com.example.studentinformation.model.Student;
import com.example.studentinformation.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public void addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
    }

    @PutMapping("/{id}")
    public void editStudent(@PathVariable int id, @RequestBody Student student) {
        studentService.editStudent(student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable int id) {
        studentService.deleteStudent(id);
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable int id) {
        return studentService.getStudent(id);
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

}
