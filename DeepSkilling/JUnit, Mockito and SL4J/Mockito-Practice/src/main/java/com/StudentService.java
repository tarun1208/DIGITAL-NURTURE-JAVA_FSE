package com.example;

public class StudentService {

    private StudentApi api;

    public StudentService(StudentApi api) {
        this.api = api;
    }

    public String fetchStudent(int id) {
        return api.getStudentName(id);
    }
}