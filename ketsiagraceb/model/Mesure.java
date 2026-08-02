package model;

public class Mesure {

    private long timestamp;
    private String capteur;
    private double valeur;
    private String unite;

    public Mesure(long timestamp, String capteur, double valeur, String unite) {
        this.timestamp = timestamp;
        this.capteur = capteur;
        this.valeur = valeur;
        this.unite = unite;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public String getCapteur() {
        return capteur;
    }

    public double getValeur() {
        return valeur;
    }

    public String getUnite() {
        return unite;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public void setCapteur(String capteur) {
        this.capteur = capteur;
    }

    public void setValeur(double valeur) {
        this.valeur = valeur;
    }

    public void setUnite(String unite) {
        this.unite = unite;
    }

    @Override
    public String toString() {
        return "Mesure{" +
                "timestamp=" + timestamp +
                ", capteur='" + capteur + '\'' +
                ", valeur=" + valeur +
                ", unite='" + unite + '\'' +
                '}';
    }
}