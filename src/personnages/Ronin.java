package personnages;

public class Ronin extends Humain {
	private int honneur;
	public Ronin(String nom, String boissonPref, int quantiteArgent) {
		super(nom, boissonPref, quantiteArgent);
		honneur=1;
	}
	
	public void donner(Commercant beneficiaire){
		int argentDonne=quantiteArgent * 10/100;
		
		perdreArgent(argentDonne);
		parler( beneficiaire.getNom()+" prend ces "+ argentDonne +" sous");
		beneficiaire.recevoir(argentDonne);
		 
	}
	
	public void provoquer(Yakuza adversaire) {
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à "
				+ "ce pauvre\r\n"
				+ "marchand!");
		if( honneur  >= adversaire.getReputation()) {
			parler("Je t’ai eu petit yakusa");
			int argentGagner=adversaire.perdre();
			gagnerArgent(argentGagner);
			honneur++;
			

		}
		else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup");
			adversaire.gagner(quantiteArgent);
			perdreArgent(quantiteArgent);
			honneur--;
		}
	}
	


}
