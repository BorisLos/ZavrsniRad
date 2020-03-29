/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.moje.zavrsnirad.util;

/**
 *
 * @author LasovicaPC
 */
public class ZRadException extends Exception{
     
    private String poruka;

    public ZRadException(String poruka) {
        this.poruka = poruka;
    }

    public String getPoruka() {
        return poruka;
    }

    
    
}
