package personnages;

import java.lang.reflect.Method;

public class Samourai extends Ronin{
	String seigneur;
	
	public Samourai(String seigneur, String nom, String boissonPref, int quantiteArgent) {
		super(nom,boissonPref,quantiteArgent);
		this.seigneur=seigneur;
		
		}
		
	@Override
	public void direBonjour(){
		sePresenter();
		parler("Je suis fier de servir le seigneur " + seigneur+ ".");
	}
}
