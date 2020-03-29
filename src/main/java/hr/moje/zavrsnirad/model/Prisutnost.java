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
@Table(name = "prisutnost")

public class Prisutnost extends Clan{
    
    private String kolo;

    public String getKolo() {
        return kolo;
    }

    public void setKolo(String kolo) {
        this.kolo = kolo;
    }
    
    
    
}
