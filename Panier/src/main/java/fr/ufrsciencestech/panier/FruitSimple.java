/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author sj063533
 */
public abstract class FruitSimple {
    private double prix;
    private String origine;
    
    public FruitSimple(String origine,double prixC){
	if(prixC<=0){this.prix=1;}
	else{this.prix=prixC;}
	this.origine=origine;
    }
    
    public FruitSimple()
    {
        this.setOrigine("Ludostan");
        this.setPrix(5000);
        
    }
    
    public double getPrix()
    {
		return this.prix;
    }
	
	public String getOrigine()
	{
		return this.origine;
	}
        
        public void setPrix(int prix)
        {
            this.prix=prix;
        }
        public void setOrigine(String origine)
        {
            this.origine=origine;
        }
        
        public abstract String toString();
        
        
    
}
