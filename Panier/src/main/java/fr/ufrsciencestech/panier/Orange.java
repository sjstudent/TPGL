package fr.ufrsciencestech.panier;

import java.util.HashSet;
import java.util.Set;

public class Orange{
	private double prix;
	private String origine;
	
	public Orange(String origine,double prixC){
		if(prixC<=0){this.prix=1;}
		else{this.prix=prixC;}
		this.origine=origine;
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
        
        /*public Orange (int prix,String origine)
        {
            this.setPrix(prix);
            this.setOrigine(origine);
            
        }*/
        
        public Orange ()
        {
            this.setPrix(5000);
            this.setOrigine("Ludostan");
            
        }
	
	/*public static void main(String[] args) {
		Orange patate=new Orange("Le string de Ludo",50);
		System.out.println(patate.getOrigine());
		Orange carotte=new Orange("Le string de Sarah",5000);
		System.out.println(carotte.getPrix());
		Orange salsifi=new Orange("Le string de Tristan",-8);
		System.out.println(salsifi.getPrix());
		//J'aime ton saucisson.
		
	}*/
        
        public String toString()
        {
            return "L'orange coute " + this.getPrix() + " et vient de " + this.getOrigine();
        }
}
