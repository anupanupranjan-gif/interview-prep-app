package com.interviewprep.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/admin")
public class AdminController {
    @PostMapping("/add-question")
    public ResponseEntity<String> addQuestion(@RequestBody String question) {
        return ResponseEntity.ok("Question added: " + question);
    }
}