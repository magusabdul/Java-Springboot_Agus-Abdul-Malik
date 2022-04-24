package com.magusabdul.spingjjwt.service;

import com.magusabdul.spingjjwt.model.User;
import com.magusabdul.spingjjwt.payload.TokenResponse;
import com.magusabdul.spingjjwt.payload.UsernamePassword;

import org.springframework.stereotype.Component;

@Component
public interface AuthService {
    User register(UsernamePassword req);
    TokenResponse generateToken(UsernamePassword req);
}
