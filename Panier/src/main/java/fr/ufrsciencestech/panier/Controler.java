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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        if(e.getSource().getName().equals("Plus")){
            panier.ajoute(new Orange (1457,"Luluberludo"));
        }
        else{panier.retire();}
    }
    
}
