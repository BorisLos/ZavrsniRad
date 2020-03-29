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
@Table(name = "kategorija")
public class Kategorija extends Clan{
    
    private String nazivKategorija;

    public String getNazivKategorija() {
        return nazivKategorija;
    }

    public void setNazivKategorija(String nazivKategorija) {
        this.nazivKategorija = nazivKategorija;
    }
    
    
    
}
