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

import java.util.*;

public class VueConsole implements Observer{
    private String trace;
    
    public VueConsole()
    {
        
    }
    
    public String getTrace(){
        return this.trace;
    }
    
    public void setTrace(String trace){
        this.trace=trace;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println((Panier)o);
    }
    
}
