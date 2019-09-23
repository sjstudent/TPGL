public class Orange{
	public double prix;
	public String origine;
	
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
	
	public static void main(String[] args) {
		Orange patate=new Orange("Le string de Ludo",50);
		System.out.println(patate.getOrigine());
		Orange carotte=new Orange("Le string de Sarah",5000);
		System.out.println(carotte.getPrix());
		Orange salsifi=new Orange("Le string de Tristan",-8);
		System.out.println(salsifi.getPrix());
		
		
	}
}
