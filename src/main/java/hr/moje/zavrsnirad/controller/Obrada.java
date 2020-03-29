/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.moje.zavrsnirad.controller;

import hr.moje.zavrsnirad.util.HibernateUtil;
import hr.moje.zavrsnirad.util.ZRadException;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author LasovicaPC
 */
public abstract class Obrada<T> {
    
    protected T entitet;
    protected Session session;
    protected abstract void kontrolaCreate() throws ZRadException;
    protected abstract void kontrolaUpdate() throws ZRadException;
    protected abstract void kontrolaDelete() throws ZRadException;
    public abstract List<T> getPodaci();
    protected abstract void nakonSpremanja() throws ZRadException;

    public Obrada(T entitet) {
        this();
        this.entitet = entitet;
        
    }

    
    public Obrada(){
        
        session = HibernateUtil.getSessionFactory().openSession();
    }
    
    public T getEntitet() {
        return entitet;
    }

    public void setEntitet(T entitet) {
        this.entitet = entitet;
    }


    
    public T create() throws ZRadException{
        System.out.println(entitet);
        kontrolaCreate();
        save();
        nakonSpremanja();
        return entitet;
        
    }
    
    
    
    
    
    public void createAll(List<T> lista) throws ZRadException{
    
        session.beginTransaction();
        for(T sl : lista){
            this.entitet=sl;
            kontrolaCreate();
            session.save(sl);
            nakonSpremanja();
        }
        session.getTransaction().commit();
        
        
    }
        
    public T update() throws ZRadException{
        kontrolaUpdate();
        save();
        nakonSpremanja();
        return entitet;
    }    
    
    
    public boolean delete() throws ZRadException{
        kontrolaDelete();
        session.beginTransaction();
        session.delete(entitet);
        session.getTransaction().commit();
        //provjeriti da li je obrisano. Vjerojatno će entitet.getSifra biti null
        return true;
    }

    private void save() {
        session.beginTransaction();
        session.save(entitet);
        session.getTransaction().commit();
    }
    
    
    
    
    
}
