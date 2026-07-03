package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

public class StudentsServiceTest {

    @Test
    void testArgumentMatcher() {

        StudentsRepository mockRepository = mock(StudentsRepository.class);

        when(mockRepository.findStudent(anyInt())).thenReturn("Tarun");

        StudentsService service = new StudentsService(mockRepository);

        String result = service.getStudent(101);

        assertEquals("Tarun", result);

        verify(mockRepository).findStudent(101);

    }

}