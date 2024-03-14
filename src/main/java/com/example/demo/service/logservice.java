package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Login;
import com.example.demo.repository.LoginRepo;

@Service
public class logservice {
    @Autowired
    LoginRepo rep; 
    public Login log(String username, String password){
        Login user = rep.findByUsernameAndPassword(username, password);
        return user;
    }
}
