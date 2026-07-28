package Arsene.utils;

import Arsene.model.*;
import java.util.ArrayList;
import java.util.List;

public class GenerateurDonnees {

    public static List<String[]> generer(int nombreMesures) {

        List<String[]> donnees = new ArrayList<>();

        CapteurTemperature temp = new CapteurTemperature();
        CapteurHumidite hum = new CapteurHumidite();
        CapteurPression pres = new CapteurPression();

        for (int i = 0; i < nombreMesures; i++) {

            donnees.add(new String[]{
                    String.valueOf(System.currentTimeMillis()),
                    temp.getNom(),
                    String.valueOf(temp.lireValeur()),
                    temp.getUnite()
            });

            donnees.add(new String[]{
                    String.valueOf(System.currentTimeMillis()),
                    hum.getNom(),
                    String.valueOf(hum.lireValeur()),
                    hum.getUnite()
            });

            donnees.add(new String[]{
                    String.valueOf(System.currentTimeMillis()),
                    pres.getNom(),
                    String.valueOf(pres.lireValeur()),
                    pres.getUnite()
            });
        }

        return donnees;
    }
}

