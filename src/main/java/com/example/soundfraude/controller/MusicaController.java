package com.example.soundfraude.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MusicaController {


    @GetMapping("musica")
    public String tocarMusica(){
        return "Tocando Jesus Chorou!!" ;
    }

}
