package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class ServiceTest {

    @Test
    void testVerifyRepositoryCall() {

        //Creating Mock Repository
        Repository mockRepository = mock(Repository.class);

        //Stub Repository Method(defining what to return)
        when(mockRepository.getData()).thenReturn("Mock Data");

        //Injecting Mock into Service
        Service service = new Service(mockRepository);

        //Call Service Method
        String result = service.processData();

        //Results verification
        assertEquals("Processed Mock Data", result);

        //Verify Repository Interaction
        verify(mockRepository).getData();
    }
}