package Arsene.main;

import Arsene.utils.GenerateurDonnees;
import Arsene.utils.ExportCSV;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // 1. Générer les données
        List<String[]> donnees = GenerateurDonnees.generer(10); // 10 mesures

        // 2. Chemin du fichier CSV
        String chemin = "data/mesures.csv";

        // 3. Exporter les données
        ExportCSV.exporter(chemin, donnees);

        System.out.println("Programme terminé.");
    }
}

