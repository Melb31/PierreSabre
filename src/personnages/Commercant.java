package personnages;

public class Commercant extends Humain{

	public Commercant(String nom, int quantiteArgent) {
		super(nom, "thé", quantiteArgent);
	
	}
	
	public int seFaireExtorquer() {
		parler("J'ai tout perdu ! Le monde est trop injuste...");
		int argentPrit=quantiteArgent;
		perdreArgent(quantiteArgent);
		return argentPrit;

	}
	public void recevoir(int argent) {
		parler(argent +" sous ! Je te remercie généreux donateur !");
		gagnerArgent(argent);
	}
	
	

}
