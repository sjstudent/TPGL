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
public class Cerise extends FruitSimple{
    private double prix;
    private String origine;
	
	public Cerise(String origine,double prixC){
		super(origine,prixC);
	}
	
        
        public Cerise ()
        {
            super();
            
        }
        
        public String toString()
        {
            return "La cerise coute " + this.getPrix() + " et vient de " + this.getOrigine();
        }
}
