package com.example.signup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.signup.entity.Signup;
import com.example.signup.repository.SignupRepository;

@RestController
public class SignupController {

    @Autowired
    SignupRepository signupRepository;

    @PostMapping("/signup")
    public String signup(@RequestBody Signup signup) {

        signupRepository.save(signup);

        return "Account Created Successfully";
    }
}