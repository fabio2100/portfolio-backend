/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fabio.dependenciesdeinitiliazr;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Usuario
 */
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class PersonaController {
    
    @Autowired
    private PersonaRepository personaRepository;
    PersonaController(PersonaRepository personaRepository){
        this.personaRepository = personaRepository; 
    }
    
    @GetMapping("/personas")
    public List<PersonaModel> index(){
        System.out.println("domiciilios controller");
        System.out.println(personaRepository.findAll());
        return personaRepository.findAll();
    }
    
}
