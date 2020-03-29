/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.moje.zavrsnirad.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author LasovicaPC
 */

@Entity
@Table(name = "rezultat")
public class Rezultat extends Clan{
    
    
    @Column(name="vrijeme")
    private String vrijeme;
    
    @Column(name="duzina")
    private String duzina;
    
    @Column(name="kolo")
    private String kolo;

    public String getVrijeme() {
        return vrijeme;
    }

    public void setVrijeme(String vrijeme) {
        this.vrijeme = vrijeme;
    }

    public String getDuzina() {
        return duzina;
    }

    public void setDuzina(String duzina) {
        this.duzina = duzina;
    }

    public String getKolo() {
        return kolo;
    }

    public void setKolo(String kolo) {
        this.kolo = kolo;
    }
    
    
}
