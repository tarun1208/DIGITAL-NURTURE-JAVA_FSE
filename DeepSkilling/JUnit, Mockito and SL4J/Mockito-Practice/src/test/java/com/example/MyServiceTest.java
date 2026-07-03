package com.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    void testVerifyInteraction() {

        //Creating Mock Object
        ExternalApi mockApi = mock(ExternalApi.class);

        //Stub Method is used
        when(mockApi.getData()).thenReturn("Mock Data");

        //Create Service
        MyService service = new MyService(mockApi);

        //Calls Method
        service.fetchData();

        //Verify Interaction
        verify(mockApi).getData();
    }
}