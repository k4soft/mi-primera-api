package com.k4soft.servicioweb.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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


    @PutMapping("/vi/{idPersona}/persona")
    public String actualizar(@PathVariable( required = true) Integer idPersona ,@RequestBody PersonaDTO personaDTO){
        return "La persona a actualizar es "+personaDTO.getNombres().concat(" ").concat(personaDTO.getApellidos());
    }

    @GetMapping("/vi/{idPersona}/persona")
    public PersonaDTO buscarPorId(@PathVariable( required = true) Integer idPersona){
        return findByidPersona(idPersona);
    }


    private PersonaDTO findByidPersona(Integer idPersona){

        List<PersonaDTO> listaPersonas = new ArrayList<>();
        listaPersonas.add(new PersonaDTO(1,"Diego", "Garcia"));
        listaPersonas.add(new PersonaDTO(2,"Camila", "Martinez"));
        listaPersonas.add(new PersonaDTO(3,"Sara","Acevedo"));
        PersonaDTO personaEncontrada = null;
        for(PersonaDTO personaDTO: listaPersonas){
            if(personaDTO.getIdPersona() == idPersona){
                personaEncontrada = personaDTO;
            }
        }
        return personaEncontrada;
    }

    @DeleteMapping("/vi/{idPersona}/persona")
    public String eliminar(@PathVariable( required = true) Integer idPersona){
        return "La persona con id: "+idPersona+" Se ha eliminado satisfactorimente";
    }





}
