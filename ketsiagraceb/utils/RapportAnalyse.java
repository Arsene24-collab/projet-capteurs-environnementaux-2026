package utils;

import analyse.AnalyseHumidite;
import analyse.AnalysePression;
import analyse.AnalyseTemperature;
import model.Mesure;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class RapportAnalyse {
    public static void genererRapport(List<Mesure> mesures) {

        try {

            PrintWriter writer = new PrintWriter(new FileWriter("data/rapport_analyse.txt"));

            writer.println("__ RAPPORT D'ANALYSE __");
            writer.println();

            writer.println("TEMPERATURE");
            writer.println("Moyenne : " + AnalyseTemperature.calculerMoyenne(mesures));
            writer.println("Minimum : " + AnalyseTemperature.calculerMinimum(mesures));
            writer.println("Maximum : " + AnalyseTemperature.calculerMaximum(mesures));
            writer.println("Variance : " + AnalyseTemperature.calculerVariance(mesures));
            writer.println("Anomalies : " + AnalyseTemperature.compterAnomalies(mesures));
            writer.println();

            writer.println("HUMIDITE");
            writer.println("Moyenne : " + AnalyseHumidite.calculerMoyenne(mesures));
            writer.println("Minimum : " + AnalyseHumidite.calculerMinimum(mesures));
            writer.println("Maximum : " + AnalyseHumidite.calculerMaximum(mesures));
            writer.println("Variance : " + AnalyseHumidite.calculerVariance(mesures));
            writer.println("Anomalies : " + AnalyseHumidite.compterAnomalies(mesures));
            writer.println();

            writer.println("PRESSION");
            writer.println("Moyenne : " + AnalysePression.calculerMoyenne(mesures));
            writer.println("Minimum : " + AnalysePression.calculerMinimum(mesures));
            writer.println("Maximum : " + AnalysePression.calculerMaximum(mesures));
            writer.println("Variance : " + AnalysePression.calculerVariance(mesures));
            writer.println("Anomalies : " + AnalysePression.compterAnomalies(mesures));
            writer.println();

            writer.println("Fin du rapport");
            writer.close();

        } catch (IOException e) {

            System.out.println("Erreur lors de la création du rapport.");
        }

    }

}
