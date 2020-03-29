/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.moje.zavrsnirad.controller;

import hr.moje.zavrsnirad.model.Rezultat;
import hr.moje.zavrsnirad.util.ZRadException;
import java.util.List;

/**
 *
 * @author LasovicaPC
 */
public class ObradaRezultat extends ObradaClan<Rezultat>{

    public ObradaRezultat(Rezultat entitet) {
        super(entitet);
    }

    public ObradaRezultat() {
        
        super();
    }
    

    @Override
    protected void kontrolaCreate() throws ZRadException {
      
    }

    @Override
    protected void kontrolaUpdate() throws ZRadException {
       
    }

    @Override
    protected void kontrolaDelete() throws ZRadException {
       
    }
    
    @Override
    protected void nakonSpremanja() throws ZRadException {
       
    }    

    @Override
    public List<Rezultat> getPodaci() {
        return null;
        
    }
    
}
