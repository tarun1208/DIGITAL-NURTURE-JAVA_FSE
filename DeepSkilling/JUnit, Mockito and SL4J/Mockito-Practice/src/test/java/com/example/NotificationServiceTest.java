package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class NotificationServiceTest {

    @Test
    void testEmailFailure() {

        EmailService mockEmail = mock(EmailService.class);

        doThrow(new RuntimeException("Email Server Down"))
                .when(mockEmail)
                .sendEmail("Welcome!");

        NotificationService service =
                new NotificationService(mockEmail);

        RuntimeException exception =
                assertThrows(RuntimeException.class,
                        service::notifyUser);

        verify(mockEmail).sendEmail("Welcome!");

    }

}