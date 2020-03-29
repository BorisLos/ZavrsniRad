/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.moje.zavrsnirad.controller;

import hr.moje.zavrsnirad.model.Prisutnost;
import hr.moje.zavrsnirad.util.ZRadException;
import java.util.List;

/**
 *
 * @author LasovicaPC
 */
public class ObradaPrisutnost extends ObradaClan<Prisutnost>{

    public ObradaPrisutnost(Prisutnost entitet) {
        super(entitet);
    }

    public ObradaPrisutnost() {
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
    public List<Prisutnost> getPodaci() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
