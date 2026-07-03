package com.example.repository;

import com.example.model.Student;

public interface StudentRepository {
    Student findById(int id);
}