package com.interviewprep.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/payment")
public class StripeController {
    @PostMapping("/create-checkout-session")
    public ResponseEntity<String> createCheckoutSession() {
        return ResponseEntity.ok("Stripe checkout session created");
    }
}