/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.moje.zavrsnirad.controller;

import hr.moje.zavrsnirad.model.Clan;
import hr.moje.zavrsnirad.util.ZRadException;
import java.util.List;

/**
 *
 * @author LasovicaPC
 */
public class ObradaClan extends ObradaOsoba<Clan>{


    public ObradaClan(Clan entitet) {
        super(entitet);
    }

    public ObradaClan() {
        super();
    }
    

    @Override
    protected void kontrolaCreate() throws ZRadException{
     
        
    }
    
    @Override
    protected void kontrolaUpdate() throws ZRadException{
        
    }
    
    
    @Override
    protected void kontrolaDelete() throws ZRadException{
        
    }

    @Override
    public List<Clan> getPodaci() {
        return session.createQuery("from Clan").list();
    }

    @Override
    protected void nakonSpremanja() throws ZRadException {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    
    
}
