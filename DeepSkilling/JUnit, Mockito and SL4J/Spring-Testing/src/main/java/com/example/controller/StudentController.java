package com.example.controller;

import com.example.model.Students;
import com.example.service.StudentServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    private final StudentServices service;

    public StudentController(StudentServices service) {
        this.service = service;
    }

    @GetMapping("/students")
    public Students getStudents() {

        return service.getStudents();

    }

}