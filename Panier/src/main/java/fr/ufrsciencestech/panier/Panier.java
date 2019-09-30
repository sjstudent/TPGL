package fr.ufrsciencestech.panier;

import java.util.ArrayList;

public class Panier
{
	private ArrayList<Orange> liste;
	private int tailleMaxPanier;
	public Panier(int tailleMax)
	{
		this.liste=new ArrayList<Orange>();
		this.tailleMaxPanier=tailleMax;
	}
	
	public void setTailleMaxPanier(int newTailleMax)
	{
		this.tailleMaxPanier=newTailleMax;
	}
	
	public int getTailleMaxPanier()
	{
		return this.tailleMaxPanier;
	}
	
	public int getNbFruitsPanier()
	{
		return this.liste.size();
	}
        
        public ArrayList<Orange> getListeOrange()
        {
            return this.liste;
        }
	
	public boolean estVide()
	{
		return this.getNbFruitsPanier()==0;
	}
	
	public boolean estPlein()
	{
		return this.getNbFruitsPanier()==this.tailleMaxPanier;
	}
	
	public boolean ajoute (Orange o)
	{
		if(this.estPlein())
		{
			System.out.println("Le panier est plein.");
			return false;
		}
		else
		{
			this.liste.add(o);
			return true;
		}
	}
        
        public boolean retire()
        {
            if(this.estVide()){
                System.out.println("Le panier est déjà vide.");
                return false;
            }
            this.getListeOrange().remove(this.getNbFruitsPanier()-1);
            return true;
        }
        
       /* public void boycottOrigin(String origine)
        {
            for (int i=0;i<this.getNbFruitsPanier();i++)
            {
                if(this.getListeOrange().get(i).getOrigine().equals(origine)){
                    this.retire();
                }
            }
        }*/
	
	/*public static void main(String[] args) {
		Panier sac = new Panier(5);
		Orange patate=new Orange("Le char de Ludo",50);
		Orange carotte=new Orange("Le char de Sarah",5000);
		Orange salsifi=new Orange("Le char de Tristan",-8);
		sac.ajoute(patate);
		sac.ajoute(carotte);
		sac.ajoute(salsifi);
		System.out.println(sac.estPlein());
		System.out.println(sac.getNbFruitsPanier());
		sac.ajoute(carotte);
		sac.ajoute(carotte);
		sac.ajoute(carotte);
		System.out.println(sac.estPlein());
		
	}*/
	
	
}
