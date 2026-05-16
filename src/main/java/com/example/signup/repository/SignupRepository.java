package com.example.signup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.signup.entity.Signup;

public interface SignupRepository extends JpaRepository<Signup, Integer> {

}