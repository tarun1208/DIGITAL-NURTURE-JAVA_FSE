package com.example;

public class StudentsService {

    private StudentsRepository repository;

    public StudentsService(StudentsRepository repository) {
        this.repository = repository;
    }

    public String getStudent(int id) {

        return repository.findStudent(id);

    }

}