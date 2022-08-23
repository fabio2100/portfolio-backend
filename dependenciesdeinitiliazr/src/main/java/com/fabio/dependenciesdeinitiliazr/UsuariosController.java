/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fabio.dependenciesdeinitiliazr;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Usuario
 */
@RestController
public class UsuariosController {
    
    @Autowired
    private UsuariosRepository usuariosRepository;
    UsuariosController(UsuariosRepository usuariosRepository){
        this.usuariosRepository = usuariosRepository; 
    }
    
    @GetMapping("/usuarios")
    public List<UsuariosModel> index(){
        System.out.println("domiciilios controller");
        System.out.println(usuariosRepository.findAll());
        return usuariosRepository.findAll();
    }
    
}