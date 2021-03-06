/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.moje.zavrsnirad.model;

import javax.persistence.MappedSuperclass;

/**
 *
 * @author LasovicaPC
 */

@MappedSuperclass
public abstract class Osoba extends Entitet{
    
    private String ime;
    private String prezime;
    private String email;

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
   
    
    @Override
    public String toString() {
        return prezime + " " + ime;
    }
    
}
