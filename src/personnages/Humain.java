package personnages;

public class Humain {
	private String nom;
	private String boissonPref;
	protected int quantiteArgent;
	
	
	
	public Humain(String nom, String boissonPref, int quantiteArgent) {
		this.nom = nom;
		this.boissonPref = boissonPref;
		this.quantiteArgent = quantiteArgent;
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
	
	public void direBonjour() {
		parler("Bonjour !, Je m'appelle "+nom+" et j'aime boire du" +boissonPref);
	}
	public void boire() {
		parler("Mmmm, un bon verre de "+boissonPref+" ! GLOUPS !");
	}
	
	public void gagnerArgent(int gain) {
		quantiteArgent+=gain;	
	}
	
	public void perdreArgent(int perte) {
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
		
	}
	
	
