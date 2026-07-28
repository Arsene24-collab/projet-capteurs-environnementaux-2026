package Arsene.utils;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ExportCSV {

    public static void exporter(String cheminFichier, List<String[]> donnees) {

        try (FileWriter writer = new FileWriter(cheminFichier)) {

            // En-tête du CSV
            writer.write("timestamp,capteur,valeur,unite\n");

            // Données
            for (String[] ligne : donnees) {
                writer.write(String.join(",", ligne));
                writer.write("\n");
            }

            System.out.println("Export CSV réussi : " + cheminFichier);

        } catch (IOException e) {
            System.out.println("Erreur lors de l'export CSV : " + e.getMessage());
        }
    }
}
