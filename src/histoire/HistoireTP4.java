package histoire;


import personnages.Commercant;
import personnages.Humain;
import personnages.Yakuza;


public class HistoireTP4 {

	public static void main(String[] args) {
		Humain Prof= new Humain("Prof","kombucha",54);
		Prof.direBonjour();

		Commercant Marco= new Commercant("Marco",15);
		Marco.direBonjour();
		Yakuza YakuLeNoir= new Yakuza("Yaku Le Noir", "ice tea", 30, "Furry");
		YakuLeNoir.direBonjour();
		YakuLeNoir.extorquer(Marco);
	}

}
