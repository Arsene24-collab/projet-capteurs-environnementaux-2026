import exceptions.DonneeInvalideException;
import model.Mesure;
import utils.LecteurCSV;
import utils.RapportAnalyse;

import java.io.IOException;
import java.util.List;

public class MainAnalyse {

    public static void main(String[] args) {

        try {
            List<Mesure> mesures = LecteurCSV.lireFichier("data/mesures.csv");

            RapportAnalyse.genererRapport(mesures);

            System.out.println("Rapport généré avec succès !");

        } catch (IOException e) {
            System.out.println("Erreur lors de la lecture du fichier CSV.");

        } catch (DonneeInvalideException e) {
            System.out.println("Erreur :" +e.getMessage());
        }
    }
}