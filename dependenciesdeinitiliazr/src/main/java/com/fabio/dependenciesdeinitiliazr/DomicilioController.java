/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fabio.dependenciesdeinitiliazr;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Usuario
 */

@RestController
public class DomicilioController {
    
    @Autowired
    private DomicilioRepository domicilioRepository;
    DomicilioController(DomicilioRepository domicilioRepository){
        this.domicilioRepository = domicilioRepository; 
    }
    
    @GetMapping("/domicilios")
    public List<DomicilioModel> index(){
        System.out.println("domiciilios controller");
        System.out.println(domicilioRepository.findAll());
        return domicilioRepository.findAll();
    }
    
}
