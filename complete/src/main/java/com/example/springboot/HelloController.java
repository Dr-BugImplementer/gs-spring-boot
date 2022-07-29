package com.example.springboot;

import com.example.springboot.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    LoginRepository loginRepo;
    @GetMapping(" ")
    @PostMapping("/login1")
    public String index() {

        return "Das ist die Ox-Kasino API!!";

    }

}