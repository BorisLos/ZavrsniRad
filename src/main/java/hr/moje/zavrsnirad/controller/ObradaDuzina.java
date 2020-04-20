/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.moje.zavrsnirad.controller;

import hr.moje.zavrsnirad.model.Duzina;
import hr.moje.zavrsnirad.model.Rezultat;
import hr.moje.zavrsnirad.util.ZRadException;
import java.util.List;

/**
 *
 * @author LasovicaPC
 */
public class ObradaDuzina extends Obrada<Duzina> {

    public ObradaDuzina(Duzina entitet) {
        super(entitet);
    }

    public ObradaDuzina() {
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
    public List<Duzina> getPodaci() {
        return session.createQuery("from Duzina").list();
    }
    
}
