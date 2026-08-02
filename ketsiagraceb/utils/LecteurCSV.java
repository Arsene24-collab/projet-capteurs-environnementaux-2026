package utils;

import exceptions.DonneeInvalideException;
import model.Mesure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LecteurCSV {

    public static List<Mesure> lireFichier(String fichier) throws IOException, DonneeInvalideException {

        List<Mesure> mesures = new ArrayList<>();

        BufferedReader lecteur = new BufferedReader(new FileReader(fichier));

        String ligne;

        lecteur.readLine();

        while ((ligne = lecteur.readLine()) != null) {
            String[] parties = ligne.split(",");

            if (parties.length != 4) {
                throw new DonneeInvalideException("La ligne CSV est invalide.");
            }

            long timestamp = Long.parseLong(parties[0]);
            String capteur = parties[1];
            double valeur = Double.parseDouble(parties[2]);
            String unite = parties[3];

            Mesure mesure = new Mesure(timestamp, capteur, valeur, unite);

            mesures.add(mesure);

        }

        lecteur.close();
        return mesures ;
    }
}
