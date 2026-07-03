package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

public class StudentServiceTest {

    @Test
    void testAnyIntMatcher() {

        StudentApi mockApi = mock(StudentApi.class);

        when(mockApi.getStudentName(anyInt()))
                .thenReturn("Tarun");

        StudentService service = new StudentService(mockApi);

        String result = service.fetchStudent(101);

        assertEquals("Tarun", result);

        verify(mockApi).getStudentName(101);
    }
}