/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.fabio.dependenciesdeinitiliazr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
/**
 *
 * @author Usuario
 */
public interface DomicilioRepository extends JpaRepository<DomicilioModel,Integer> {
    
}
