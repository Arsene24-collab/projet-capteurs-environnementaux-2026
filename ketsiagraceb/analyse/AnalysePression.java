package analyse;

import model.Mesure;
import java.util.List;

public class AnalysePression {
    public static double calculerMoyenne(List<Mesure> mesures) {

        double somme = 0;
        int compteur = 0;

        for (Mesure mesure : mesures) {

            if (mesure.getCapteur().equals("Pression")) {

                somme = somme + mesure.getValeur();
                compteur++;
            }
        }

        if (compteur == 0) {
            return 0;
        }

        return somme / compteur;
    }
    public static double calculerMinimum(List<Mesure> mesures) {

        double minimum = Double.MAX_VALUE;

        for (Mesure mesure : mesures) {

            if (mesure.getCapteur().equals("Pression")) {

                if (mesure.getValeur() < minimum) {
                    minimum = mesure.getValeur();
                }
            }
        }

        return minimum;
    }
    public static double calculerMaximum(List<Mesure> mesures) {

        double maximum = Double.MIN_VALUE;

        for (Mesure mesure : mesures) {

            if (mesure.getCapteur().equals("Pression")) {

                if (mesure.getValeur() > maximum) {
                    maximum = mesure.getValeur();
                }
            }
        }

        return maximum;
    }
    public static double calculerVariance(List<Mesure> mesures) {

        double moyenne = calculerMoyenne(mesures);
        double somme = 0;
        int compteur = 0;

        for (Mesure mesure : mesures) {

            if (mesure.getCapteur().equals("Pression")) {

                somme = somme + Math.pow(mesure.getValeur() - moyenne, 2);
                compteur++;
            }
        }

        if (compteur == 0) {
            return 0;
        }

        return somme / compteur;
    }
    public static int compterAnomalies(List<Mesure> mesures) {

        int compteur = 0;

        for (Mesure mesure : mesures) {

            if (mesure.getCapteur().equals("Pression")) {

                if (mesure.getValeur() < 980 || mesure.getValeur() > 1050) {
                    compteur++;
                }
            }
        }

        return compteur;
    }
}
