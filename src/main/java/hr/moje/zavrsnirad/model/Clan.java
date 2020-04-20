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
@Table(name = "clan")
public class Clan extends Osoba{
    
    //private String ime;
    //private String prezime;
    //private String spol;
    //private String datum_rodjenja;
    //private String email;
    private String ulica;
    private String kucni_broj;
    private String grad;
    private String drzava;
    //private Kategorija kategorija;
    
    
    /**
    public Kategorija getKategorija() {
        return kategorija;
    }
    
    public void setKategorija(Kategorija kategorija) {
        this.kategorija = kategorija;
    }
    
*/
    /*
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
/*
    public String getSpol() {
        return spol;
    }

    public void setSpol(String spol) {
        this.spol = spol;
    }

    /*
    public String getDatum_rodjenja() {
        return datum_rodjenja;
    }

    public void setDatum_rodjenja(String datum_rodjenja) {
        this.datum_rodjenja = datum_rodjenja;
    }
    */

/*
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
*/
    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getKucni_broj() {
        return kucni_broj;
    }

    public void setKucni_broj(String kucni_broj) {
        this.kucni_broj = kucni_broj;
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public String getDrzava() {
        return drzava;
    }

    public void setDrzava(String drzava) {
        this.drzava = drzava;
    }

   
    
    
}
