package com.example.service;

import com.example.model.Student;
import com.example.repository.StudentRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class StudentServiceTest {

    @Test
    void testGetStudentById() {

        StudentRepository repository = mock(StudentRepository.class);

        Student student = new Student(1, "Tarun");

        when(repository.findById(1)).thenReturn(student);

        StudentService service = new StudentService(repository);

        Student result = service.getStudentById(1);

        assertEquals("Tarun", result.getName());

    }
}