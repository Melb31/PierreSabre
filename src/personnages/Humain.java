package personnages;

public class Humain {
	private String nom;
	private String boissonPref;
	protected int quantiteArgent;
	protected Humain[] memoire;
	protected int nbConnaissance=0;
	
	
	public Humain(String nom, String boissonPref, int quantiteArgent) {
		this.nom = nom;
		this.boissonPref = boissonPref;
		this.quantiteArgent = quantiteArgent;
		this.memoire= new Humain[30];
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getQuantiteArgent() {
		return quantiteArgent;
	}
	
	protected void parler(String texte){
		System.out.println("("+ nom +"):"+texte);
	}
	
	protected void sePresenter() {
		parler("Bonjour !, Je m'appelle "+nom+" et j'aime boire du" +boissonPref);
	}
	
	public void direBonjour() {
		sePresenter();
	}
	public void boire() {
		parler("Mmmm, un bon verre de "+boissonPref+" ! GLOUPS !");
	}
	
	protected void gagnerArgent(int gain) {
		quantiteArgent+=gain;	
	}
	
	protected void perdreArgent(int perte) {
		quantiteArgent-=perte;	
	}
	
	public void acheter(String objet, int prix) {
		if (prix <= quantiteArgent){
		parler("J'ai "+quantiteArgent+" sous en poche. Je vais pouvoir m'offrir une boisson à "
				+prix+" sous.");
		perdreArgent(prix);
				
		}
		else {
		parler("Je n'ai que "+quantiteArgent+" sous en poche. Je ne peux même pas m'offrir un "
					+objet+" à "+prix+" sous.");	
			
		}
		}
	
	public void faireConnaissanceAvec(Humain humain) {
		//
		direBonjour();
		humain.repondre(this);
		memoriser(humain);
	}
	private void memoriser(Humain humain) {
		
		if(nbConnaissance == 0) {
			memoire[0]=humain;
			nbConnaissance++;
		}
		else {
			if (nbConnaissance < 30) {
				nbConnaissance++;
			}
		for(int i=nbConnaissance-1; i > 0 ;i--) {
			memoire[i]=memoire[i-1];}
			memoire[0]=humain;
		}
		


	}
	
	private void repondre(Humain humain) {
		direBonjour();
		memoriser(humain);
		
		
	}
	public void listerConnaissancer() {
		parler("Je connais beaucoup de monde dont :  ");
		
		for(int i=0 ; i < nbConnaissance ; i++) {
		System.out.print(memoire[i].getNom()+", ");
			
		}
	
		System.out.println("");}
	
		
	}
	
	
