package fr.ufrsciencestech.panier;

import java.util.HashSet;
import java.util.Set;

public class Orange extends FruitSimple{
	private double prix;
	private String origine;
	
	public Orange(String origine,double prixC){
		super(origine,prixC);
	}
	
        
        public Orange ()
        {
            super();
            
        }
        
        public String toString()
        {
            return "L'orange coute " + this.getPrix() + " et vient de " + this.getOrigine();
        }
}
