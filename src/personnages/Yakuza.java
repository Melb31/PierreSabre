package personnages;

public class Yakuza extends Humain{
	private int reputation;
	private String clan;
	
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
	

}
