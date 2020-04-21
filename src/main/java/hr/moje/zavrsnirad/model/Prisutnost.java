/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.moje.zavrsnirad.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author LasovicaPC
 */


@Entity
@Table(name = "prisutnost")
public class Prisutnost extends Entitet{
    
    @ManyToOne
    private Kolo kolo;
    @ManyToOne
    private Clan clan;

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
