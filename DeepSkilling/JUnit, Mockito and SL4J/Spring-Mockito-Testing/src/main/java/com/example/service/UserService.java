package com.example.service;

import com.example.model.Users;
import com.example.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public Users getUserById(Long id) {

        return repository.findById(id).orElse(null);

    }

}