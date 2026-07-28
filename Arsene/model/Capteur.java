package Arsene.model;

import Arsene.interfaces.CapteurInterface;

public abstract class Capteur implements CapteurInterface {

    protected String nom;
    protected String unite;

    public Capteur(String nom, String unite) {
        this.nom = nom;
        this.unite = unite;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public String getUnite() {
        return unite;
    }
}

