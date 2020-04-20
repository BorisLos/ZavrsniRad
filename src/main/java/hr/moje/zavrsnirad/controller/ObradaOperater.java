/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.moje.zavrsnirad.controller;

import hr.moje.zavrsnirad.model.Operater;
import hr.moje.zavrsnirad.util.ZRadException;
import java.util.List;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author LasovicaPC
 */
public class ObradaOperater extends Obrada<Operater> {

  

    public ObradaOperater() {
        super();
    }
    
    public  ObradaOperater(Operater entitet){
        super();
    }
    
    public Operater autoriziraj(String email, String lozinka){
        
        List<Operater> lista=session.createQuery("from Operater o "
            + " where o.email=:email")
            .setParameter("email", email).list();
        if(lista==null || lista.isEmpty()){
            return null;
        }
        Operater o=lista.get(0);
        if(o==null){
            return null;
        }
        return BCrypt.checkpw(lozinka, o.getLozinka()) ? o:null;
    }
    
     @Override
    public List<Operater> getPodaci() {
         return session.createQuery("from Operater").list();
    }
    
    @Override
    protected void kontrolaCreate() throws ZRadException {
        
       //kontrolaEmail();
       kontrolaLozinka();
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

    private void kontrolaLozinka() throws ZRadException{
        if(entitet.getLozinka()==null || BCrypt.checkpw("", entitet.getLozinka())){
            throw new ZRadException("Obavezno lozinka");
        }
    }
    
}
