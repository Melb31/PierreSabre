package histoire;


import personnages.Commercant;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;


public class HistoireTP4 {

	public static void main(String[] args) {
		Humain Prof= new Humain("Prof","kombucha",54);
		Prof.direBonjour();

		Commercant Marco= new Commercant("Marco",15);
		Ronin Roro=new Ronin("Roro", "shochu", 100 );
		Yakuza YakuLN= new Yakuza("Yaku le noir", "bierre", 230, "gangg");
		Roro.provoquer(YakuLN);
	}

}
