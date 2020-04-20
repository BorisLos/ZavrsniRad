/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.moje.zavrsnirad.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author LasovicaPC
 */

@Entity
@Table(name = "rezultat")
public class Rezultat extends Entitet{
    
    
    @Column(name="vrijeme")
    private String vrijeme;
 
    @ManyToOne
    private Duzina duzina;

    @ManyToOne
    private Kolo kolo;
    

    @ManyToOne
    private Clan clan;

    public String getVrijeme() {
        return vrijeme;
    }

    public void setVrijeme(String vrijeme) {
        this.vrijeme = vrijeme;
    }

    public Duzina getDuzina() {
        return duzina;
    }

    public void setDuzina(Duzina duzina) {
        this.duzina = duzina;
    }

    public Kolo getKolo() {
        return kolo;
    }

    public void setKolo(Kolo kolo) {
        this.kolo = kolo;
    }

    public Clan getClan() {
        return clan;
    }

    public void setClan(Clan clan) {
        this.clan = clan;
    }

    

    
}
