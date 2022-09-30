package com.example.goldenticketnew.service.auth;

import com.example.goldenticketnew.security.payload.LoginRequest;
import com.example.goldenticketnew.security.payload.SignUpRequest;
import org.springframework.stereotype.Service;

import java.net.URI;

@Service
public interface AuthService  {
    String authenticateUser(LoginRequest loginRequest);
    URI registerUser(SignUpRequest signUpRequest);

}
