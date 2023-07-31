package com.example.auth.registration;

import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
    public String register(RegistrationRequest request) {
        System.out.println("Works");
        return "works";
    }
}
