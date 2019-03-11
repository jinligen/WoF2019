package Hrac;


import Itemy.IItemy;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kajanek6
 */
public class Inventar {
    private HashMap<String, IItemy> itemy;

    public Inventar() {
        this.itemy = new HashMap<>();
    }
    
    public void vlozItem(IItemy item) {
        this.itemy.put(item.getNazov(), item);
    }
    
    public IItemy vyberItem(String nazov) {
        return this.itemy.remove(nazov);
    }
    
    public void vypisItemy() {
        System.out.println("Itemy:");
        for (IItemy item : itemy.values()) {
            System.out.println(item.getNazov() + " :" + item.getPopis());
        }
    }
    
    public IItemy getItem(String nazov) {
        return this.itemy.get(nazov);
    }
}
