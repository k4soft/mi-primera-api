package com.k4soft.servicioweb.controller;

import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/v1/{numero1}/{numero2}/multiplicacion")
    public int multiplicar(@PathVariable( required = true) int numero1, @PathVariable(required = true) int numero2){
        return numero1 * numero2;
    }
    @PostMapping("/v1/persona")
    public String getDatosPersona(@RequestBody PersonaDTO personaDTO){
        return personaDTO.getNombres().concat(" ").concat(personaDTO.getApellidos());
    }


}
