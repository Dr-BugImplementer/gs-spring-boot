package com.example.springboot;

import com.example.springboot.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "https://zealous-coast-054484603.1.azurestaticapps.net")
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