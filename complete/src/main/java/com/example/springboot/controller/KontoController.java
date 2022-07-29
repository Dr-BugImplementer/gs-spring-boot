package com.example.springboot.controller;

import com.example.springboot.entity.Konto;
import com.example.springboot.repository.KontoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/konto")                                                           //Pfad damit Ressourcen eindeutig identifizierbar sind
public class KontoController {

    private KontoRepository kontoRepository;

    public KontoController(KontoRepository kontoRepository) {                       //Konstruktor
        this.kontoRepository = kontoRepository;
    }

    @GetMapping("")                                                                //Definieren wie die Methode nach Außen abrufbar ist
    public List<Konto> findAll() {
        List<Konto> all = kontoRepository.findAll();
        return all;
    }

    @GetMapping("/specific")
    public Konto kontoByID(@RequestParam(value = "kontoId",required = true) Integer kontoId,@RequestParam(value = "loginId",required = true) Integer loginId){
        return kontoRepository.findeKonto(kontoId,loginId);
    }

    @PostMapping("")
    public Konto addKonto(@RequestBody Konto newKonto) {
        return kontoRepository.save(newKonto);
    }

    @PutMapping()
    Konto replaceKonto(@RequestBody Konto newKonto) {
        return kontoRepository.save(newKonto);
    }

    // login und register endpunkt. course header

}
