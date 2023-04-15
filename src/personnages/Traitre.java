package personnages;

public class Traitre extends Samourai{
	private int niveauTraitise;
	
	public Traitre(String seigneur, String nom, String boissonPref, int quantiteArgent){
		super(seigneur,nom,boissonPref,quantiteArgent);
		niveauTraitise=0;
	}
	@Override
	public void direBonjour(){
		sePresenter();
		parler("Mon niveau de traitise est à "+ niveauTraitise +".");
	}
	
	public void ranconner(Commercant commercant){
		if (niveauTraitise <3) {
			int argentCommercant=commercant.getQuantiteArgent();
			int argentRanconner=argentCommercant*2/10;
			
			commercant.perdreArgent(argentRanconner);
			gagnerArgent(argentRanconner);
			parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer ! Donne moi "
					+ argentRanconner+" sous ou gare à toi !");
			commercant.parler("Tout suite grand "+ getNom() +".");
			
		}
		else {
			parler("Mince je ne peux plus ranconner personne sinon un samourai risque de me démasquer");
		}
		
	}
	
	public void faireLeGentil(){
		if(nbConnaissance <1) {
			parler("Je ne peux pas faire ami ami car je ne connais personne ! Snif.");
			
		}
		else {
			Humain ami=
		}
		
		
	}

}
