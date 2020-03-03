package com.k4soft.servicioweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ServicioPruebaController {

    @GetMapping("/v1/saludo")
    public String saludar(){
        return "Hola mundo";
    }

    @GetMapping("/v1/{numero1}/{numero2}/suma")
    public int sumar(@PathVariable( required = true) int numero1, @PathVariable(required = true) int numero2){
        return numero1 + numero2;
    }


}
