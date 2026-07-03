package com.example.controller;

import com.example.model.Users;
import com.example.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Users> getUser(@PathVariable Long id) {

        return ResponseEntity.ok(service.getUserById(id));

    }

}