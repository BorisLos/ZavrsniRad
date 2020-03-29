/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.moje.zavrsnirad.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author LasovicaPC
 */

@Entity
@Table(name = "duzina")

public class Duzina extends Rezultat{
    
    private String nazivDuzina;

    public String getNazivDuzina() {
        return nazivDuzina;
    }

    public void setNazivDuzina(String nazivDuzina) {
        this.nazivDuzina = nazivDuzina;
    }
    
    
    
}
