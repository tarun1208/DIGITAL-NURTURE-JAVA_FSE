package com.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class NotificationServicesTest {

    @Test
    void testSendEmail() {

        // Step 1: Create Mock
        EmailServices mockEmailService = mock(EmailServices.class);

        // Step 2: Configure Void Method
        doNothing().when(mockEmailService).sendEmail("Welcome to Mockito!");

        // Step 3: Inject Mock
        NotificationServices service = new NotificationServices(mockEmailService);

        // Step 4: Call Method
        service.notifyUser();

        // Step 5: Verify Interaction
        verify(mockEmailService).sendEmail("Welcome to Mockito!");
    }
}