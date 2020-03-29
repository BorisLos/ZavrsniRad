/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.moje.zavrsnirad.controller;

import hr.moje.zavrsnirad.model.Clan;
import hr.moje.zavrsnirad.util.ZRadException;

/**
 *
 * @author LasovicaPC
 */
public abstract class ObradaClan<T extends Clan> extends Obrada<T>{

    public ObradaClan(T entitet) {
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
    
    
    
    
}
