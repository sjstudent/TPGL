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
public class Banane extends FruitSimple{
    private double prix;
    private String origine;
	
	public Banane(String origine,double prixC){
		super(origine,prixC);
	}
	
        
        
        public Banane ()
        {
            super("Ludostan",5000);
            
        }
	
        
        public String toString()
        {
            return "La banane coute " + this.getPrix() + " et vient de " + this.getOrigine();
        }
}
