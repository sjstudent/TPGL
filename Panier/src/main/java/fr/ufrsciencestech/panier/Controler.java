/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

/**
 *
 * @author sj063533
 */

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Controler implements ActionListener{

    
    private Panier panier;
    
    public Panier getPanier(){
        return this.panier;
    }
    
    public void setPanier(Panier panier)
    {
        this.panier=panier;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(((Component)e.getSource()).getName().equals("Plus")){
            try {
                panier.ajoute(new Orange ("Luluberludo",1457));
            } catch (PanierPleinException ex) {
                Logger.getLogger(Controler.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{panier.retire();}
    }
    
}
