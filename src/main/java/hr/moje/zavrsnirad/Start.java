/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.moje.zavrsnirad;

import hr.moje.zavrsnirad.view.SplashScreen;

/**
 *
 * @author LasovicaPC
 */
public class Start {
    
    /**
     *
     */
    public Start(){
        
       // Pomocno.pocetniInsert();
        
        new SplashScreen().setVisible(true);
    }
    
    public static void main(String[] args) {
        new Start();
    }
}
