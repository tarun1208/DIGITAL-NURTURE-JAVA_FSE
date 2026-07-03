package com.example.service;

import com.example.model.Students;
import org.springframework.stereotype.Service;

@Service
public class StudentServices {

    public Students getStudents() {

        return new Students(101, "Tarun");

    }

}