package fr.ufrsciencestech.panier;

import java.util.ArrayList;
import java.util.Observable;

public class Panier extends Observable
{
	private ArrayList<FruitSimple> liste;
	private int tailleMaxPanier;
	public Panier(int tailleMax)
	{
		this.liste=new ArrayList<FruitSimple>();
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
        
        public ArrayList<FruitSimple> getListeFruitSimple()
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
	
	public void ajoute (FruitSimple o) throws PanierPleinException
	{
		if(this.estPlein())
		{
			throw new PanierPleinException();
		}
		else
		{
			this.liste.add(o);
                        setChanged();
                        notifyObservers();
		}
	}
        
        public boolean retire()
        {
            if(this.estVide()){
                System.out.println("Le panier est déjà vide.");
                return false;
            }
            this.getListeFruitSimple().remove(this.getNbFruitsPanier()-1);
            setChanged();
            notifyObservers();
            return true;
        }
        
        public float getPrix()
        {
            float total=0;
            for(int i=0;i<this.getNbFruitsPanier();i++)
            {
                total+=this.getListeFruitSimple().get(i).getPrix();
            }
            return total;
        }
        
        public int getNbOrange()
        {
            int total=0;
            for(int i=0;i<this.getNbFruitsPanier();i++)
            {
                if (this.getListeFruitSimple().get(i) instanceof Orange)
                {
                    total++;
                }
            }
            return total;
        }
        
        public int getNbCerise()
        {
            int total=0;
            for(int i=0;i<this.getNbFruitsPanier();i++)
            {
                if (this.getListeFruitSimple().get(i) instanceof Cerise)
                {
                    total++;
                }
            }
            return total;
        }
        
        public int getNbBanane()
        {
            int total=0;
            for(int i=0;i<this.getNbFruitsPanier();i++)
            {
                if (this.getListeFruitSimple().get(i) instanceof Banane)
                {
                    total++;
                }
            }
            return total;
        }
        public String toString()
        {
            String s="";
            s+=this.getNbFruitsPanier() + " Fruits\n";
            s+=this.getNbOrange() + " Oranges de France\n";
            s+=this.getNbBanane() + " Bananes de France\n";
            s+=this.getNbCerise() + " Cerises de France\n";
           /* for (int i =0; i< liste.size();i++)
            {
                s+= liste.get(i).toString();
                s+="\n";
            }*/
            return s;
            
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
