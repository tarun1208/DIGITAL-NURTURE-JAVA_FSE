package com.example.service;

import com.example.model.Users;
import com.example.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.Optional;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    private UserRepository repository;

    @InjectMocks
    private UserService service;

    @Test
    void testGetUserById() {

        Users user = new Users(1L, "Tarun");

        when(repository.findById(1L)).thenReturn(Optional.of(user));

        Users result = service.getUserById(1L);

        assertEquals("Tarun", result.getName());

    }

}