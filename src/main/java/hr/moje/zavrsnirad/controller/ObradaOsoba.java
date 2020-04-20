/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.moje.zavrsnirad.controller;

import hr.moje.zavrsnirad.model.Osoba;
import hr.moje.zavrsnirad.util.ZRadException;

/**
 *
 * @author LasovicaPC
 */
public abstract class ObradaOsoba<T extends Osoba> extends Obrada<T>{
    
    
    public ObradaOsoba(T entitet){
        super(entitet);
    }
    
    public ObradaOsoba(){
        super();
        
    }
    
    
    @Override
    protected void kontrolaCreate() throws ZRadException {
        //kontrolaOib();
        //kontrolaEmail();
    }

    @Override
    protected void kontrolaUpdate() throws ZRadException {
        
    }

    @Override
    protected void kontrolaDelete() throws ZRadException {
        
    }

    /*
    private void kontrolaOib() throws EdunovaException{
        if(!Pomocno.isOibValjan(entitet.getOib())){
            throw new EdunovaException("OIB nije valjan");
        }
    }
    */
    /*protected void kontrolaEmail()  throws EdunovaException{
       
    }

    */
    
    
    
}
