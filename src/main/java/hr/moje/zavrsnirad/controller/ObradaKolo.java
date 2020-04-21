/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.moje.zavrsnirad.controller;

import hr.moje.zavrsnirad.model.Kolo;
import hr.moje.zavrsnirad.util.ZRadException;
import java.util.List;

/**
 *
 * @author LasovicaPC
 */
public class ObradaKolo extends Obrada<Kolo>{

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
    public List<Kolo> getPodaci() {
        return session.createQuery("from Kolo").list();
    }

    @Override
    protected void nakonSpremanja() throws ZRadException {
    }
    //public ObradaKolo() {


        

    }
    
    
//}
/*
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
*/