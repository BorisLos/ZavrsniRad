/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.moje.zavrsnirad.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author LasovicaPC
 */

@MappedSuperclass
public abstract class Entitet {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Integer sifra; 

    public Integer getSifra() {
        return sifra;
    }

    public void setSifra(Integer sifra) {
        this.sifra = sifra;
    }
    
    
}
