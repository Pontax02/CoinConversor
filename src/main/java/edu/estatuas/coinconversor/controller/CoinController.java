package edu.estatuas.coinconversor.controller;


import org.springframework.ui.Model;
import edu.estatuas.coinconversor.service.CambioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@Controller
public class CoinController {
    @Autowired
    private CambioService cambioService;

    @GetMapping("/")
    public  String greeting() {
        return "login";
    }
    @GetMapping("/login")
    public  String greeting2() {
        return "conversor";
    }

    @PostMapping("/cambio")
    public String realizarCambio(
            @RequestParam String origen,
            @RequestParam String destino,
            @RequestParam float importe,
            Model model) throws IOException {

            double resultado = cambioService.obtenerCambio(origen,destino,importe);


            model.addAttribute("origen",origen);
            model.addAttribute("destino",destino);
            model.addAttribute("importe",importe);
            model.addAttribute("resultado",resultado);

            return "cambio";

    }






}





