package com.example.soundfraude.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArtistaController {

    @GetMapping("musica")
    public String tocarArtista() {
        return "Tocar artitsa ZEZE DE CAMARGO";

    }
}
