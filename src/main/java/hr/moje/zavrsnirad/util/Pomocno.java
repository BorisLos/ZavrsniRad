/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.moje.zavrsnirad.util;

import hr.moje.zavrsnirad.model.Clan;
import hr.moje.zavrsnirad.model.Operater;
import hr.moje.zavrsnirad.model.Rezultat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


/**
 *
 * @author LasovicaPC
 */
public class Pomocno {

    /**
     *
     */
    public static Operater LOGIRAN;
    
    
    public static String getNazivAplikacije(){
    return "Liga Trčanje";
    }
    
    public static List<String> formatirajRezultateZaListu(List<Rezultat> rezultati) {
        
        //List<String> lista = rezultati.stream().map(r -> r.getVrijeme()).collect(Collectors.toList());
        List<String> lista = rezultati.stream().map(r -> {
            Clan c = r.getClan();
            
            return String.format("%s %s-%s", c.getIme(), c.getPrezime(), r.getVrijeme());
        }).collect(Collectors.toList());
        
        lista = lista.stream()
                .sorted((r1w,r2w) -> {
                    
                    String r1 = r1w.split("-")[1];
                    String r2 = r2w.split("-")[1];
                    
                    String[] r1Split = r1.split(":");
                    String[] r2Split = r2.split(":");
                    
                    int r1h = Integer.parseInt(r1Split[0]);
                    int r1m = Integer.parseInt(r1Split[1]);
                    int r1s = Integer.parseInt(r1Split[2]);
                    
                    int r2h = Integer.parseInt(r2Split[0]);
                    int r2m = Integer.parseInt(r2Split[1]);
                    int r2s = Integer.parseInt(r2Split[2]);
                    
                    if (Integer.compare(r1h, r2h) != 0) {
                        return Integer.compare(r1h, r2h);
                    }
                    
                    if (Integer.compare(r1m, r2m) != 0) {
                        return Integer.compare(r1m, r2m);
                    }
                    
                    if (Integer.compare(r1s, r2s) != 0) {
                        return Integer.compare(r1s, r2s);
                    }
                    
                    return 0;
                })
                .collect(Collectors.toList());
        
        List<String> formatiranaLista = new ArrayList();
        
        for(int i = 0; i < lista.size(); i++) {
            formatiranaLista.add(String.format("%d. %s", i + 1, lista.get(i)));
        }
        
        return formatiranaLista;
    }
    
    /*public static void pocetniInsert() {
        
        Clan clan=new Clan();
        clan.setIme("Pero");
        clan.setPrezime("Perić");
        clan.setSpol("m");
        clan.setDatum_rodjenja("25.05.1972");
        clan.setEmail("pperic@gmail.com");
        clan.setUlica("Zagrebačka");
        clan.setKucni_broj("14");
        clan.setGrad("Vinkovci");
        clan.setDrzava("Hrvatska");
        clan.setKategorija("40-50");
        
        ObradaClan obradaClan=new ObradaClan(clan);
        try {
            obradaClan.create();
            
        } catch (ZRadException ex) {
            System.out.println(ex.getPoruka());
        }*/
        
       
        
    }
    
    
    
    
    
    
    
    
    
    
