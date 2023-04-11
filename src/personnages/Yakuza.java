package personnages;

import com.sun.java.util.jar.pack.Package.Class.Method;

public class Yakuza extends Humain{
	private int reputation;
	private String clan;
	
	public int getReputation() {
		return reputation;
	}

	public Yakuza(String nom, String boissonPref, int quantiteArgent, String clan) {
		super(nom, boissonPref, quantiteArgent);
		reputation=0;
		this.clan=clan;
	}
	
	public void extorquer(Commercant victime){
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom() +", si tu tiens à la vie donne moi ta bourse !");
		int argentVole=victime.seFaireExtorquer();
		gagnerArgent(argentVole);
		reputation+=1;
		parler("J’ai piqué les "+argentVole+ " sous de " + victime.getNom()+
				" ce qui me fait "+ quantiteArgent + " sous dans ma poche. Hi ! Hi !");
		
	}
	
	public int perdre() {
		int argentqt=quantiteArgent;
		perdreArgent(quantiteArgent);
		reputation-=1;
		parler("J’ai perdu mon duel et mes "+ argentqt+" sous, snif... J'ai déshonoré le clan de "
				+ clan+".");
		return argentqt;
	}
	
	public void gagner(int gain) {
		gagnerArgent(gain);
		reputation++;
		parler("Ce ronin pensait vraiment battre"+ getNom() + " du clan de "+ clan +" ?"
				+ "Je l'ai dépouillé de ses "+gain+ " sous.");
		
	}
	
	public void DireBonjour() {
		DireBonjour()
	}


}
