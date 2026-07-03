package com.example;

public class NotificationServices {

    private EmailServices emailService;

    public NotificationService(EmailServices emailService) {
        this.emailService = emailService;
    }

    public void notifyUser() {
        emailService.sendEmail("Welcome to Mockito!");
    }
}