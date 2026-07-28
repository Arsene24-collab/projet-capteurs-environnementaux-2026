package Arsene.model;

public class CapteurHumidite extends Capteur {

    public CapteurHumidite() {
        super("Humidité", "%");
    }

    @Override
    public double lireValeur() {
        return 30 + Math.random() * 60; // entre 30 et 90%
    }
}

