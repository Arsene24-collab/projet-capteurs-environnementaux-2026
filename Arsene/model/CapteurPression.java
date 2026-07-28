package Arsene.model;

public class CapteurPression extends Capteur {

    public CapteurPression() {
        super("Pression", "hPa");
    }

    @Override
    public double lireValeur() {
        return 980 + Math.random() * 70; // entre 980 et 1050 hPa
    }
}
