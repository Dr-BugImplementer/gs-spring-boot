package com.example.springboot.controller;

import com.example.springboot.entity.Login;
import com.example.springboot.repository.LoginRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/loginData")
public class LoginController {

    private LoginRepository loginRepository;

    public LoginController(LoginRepository loginRepository) {                       //Konstruktor
        this.loginRepository = loginRepository;
    }

    @GetMapping()
    public List<Login> index() {
        List<Login> all = loginRepository.findAll();
        return all;}

    @GetMapping("/confirm")                                   //AKTUELL
    public Login anmeldung(@RequestParam(value = "benutzername", required = true) String benutzername, @RequestParam(value = "passwort", required = true) String passwort){
       return loginRepository.findeAnmeldung(benutzername, passwort);}

    @GetMapping("/{id}")
    public Optional<Login> findById(@PathVariable String id){
        return loginRepository.findById(Integer.valueOf(id));
    }

    @PostMapping()
    public Login addLogin(@RequestBody Login newLogin) {
        return loginRepository.save(newLogin);
    }

    @PutMapping()
    Login replaceLogin(@RequestBody Login newLogin){
        return loginRepository.save(newLogin);
    }



}
