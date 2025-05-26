package com.example.user.user_service.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/{id}")
    public ResponseEntity<String> getById(@PathVariable Long id) {
        return ResponseEntity.ok("User-service: getById called with id " + id);
    }

    @GetMapping
    public ResponseEntity<String> getAll() {
        return ResponseEntity.ok("User-service: getAll called");
    }

    @GetMapping("/bouza")
    public ResponseEntity<String> getBouza() {
        return ResponseEntity.ok("ena Bouza");
    }
}