package com.magusabdul.spingjjwt.controller;

import com.magusabdul.spingjjwt.payload.TokenResponse;
import com.magusabdul.spingjjwt.payload.UsernamePassword;
import com.magusabdul.spingjjwt.service.AuthService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    
    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody UsernamePassword req){
        this.authService.register(req);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/token")
    public ResponseEntity<?> generateToken(@RequestBody UsernamePassword req){
        TokenResponse token = authService.generateToken(req);
        return ResponseEntity.ok(token);
    }
}
