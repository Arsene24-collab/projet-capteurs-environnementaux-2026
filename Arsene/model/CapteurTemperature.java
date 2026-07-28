package Arsene.model;

public class CapteurTemperature extends Capteur {

    public CapteurTemperature() {
        super("Température", "°C");
    }

    @Override
    public double lireValeur() {
        return 18 + Math.random() * 17; // entre 18 et 35°C
    }
}
