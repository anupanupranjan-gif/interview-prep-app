package com.interviewprep.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import java.util.Map;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Map<String, String> creds) {
        return ResponseEntity.ok("JWT_TOKEN_EXAMPLE");
    }
}