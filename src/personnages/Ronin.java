package personnages;

public class Ronin extends Humain {
	private int honneur;
	public Ronin(String nom, String boissonPref, int quantiteArgent) {
		super(nom, boissonPref, quantiteArgent);
		honneur=1;
	}
	
	public void donner(Commercant beneficiaire){
		int argentDonne=quantiteArgent * 10/100;
		beneficiaire.gagnerArgent(argentDonne);
		perdreArgent(argentDonne);
		parler( beneficiaire.getNom()+" prend ces "+ argentDonne +" sous");
		
	}
	


}
