package com.example.service;

import com.example.model.Student;
import com.example.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public Student getStudentById(int id) {
        return repository.findById(id);
    }
}