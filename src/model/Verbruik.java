package model;

/**
 * @author Furkan Altay
 * Purpose for the class
 */
public class Verbruik {
    public double BASIS_KOSTEN = 9.95;
    public int VERBRUIK_ABONNEMENT = 3000;
    public double MEER_PRIJS = 0.025;

    private String maand;
    private int hoeveelheidMB;
    private double kosten;

    public Verbruik() {
        this.maand = "Onbekend";
        this.hoeveelheidMB = 0;
    }

    public Verbruik(String maand) {
        this.maand = maand;
        this.hoeveelheidMB = 0;
    }

    public Verbruik(String maand, int hoeveelheidMB) {
        this.maand = maand;
        this.hoeveelheidMB = hoeveelheidMB;
    }

    public double berekenKosten() {
        if ((hoeveelheidMB - VERBRUIK_ABONNEMENT) > 0) {
            return BASIS_KOSTEN + ((hoeveelheidMB - VERBRUIK_ABONNEMENT) * MEER_PRIJS);
        }
        return BASIS_KOSTEN;
    }

    public String toonVerbruik() {
        if (hoeveelheidMB > VERBRUIK_ABONNEMENT) {
            return "buiten je bundel";
        }
        return "";
    }

    public String getMaand() {
        return maand;
    }

    public void setMaand(String maand) {
        this.maand = maand;
    }

    public int getHoeveelheidMB() {
        return hoeveelheidMB;
    }

    public void setHoeveelheidMB(int hoeveelheidMB) {
        this.hoeveelheidMB = hoeveelheidMB;
    }

    public double getKosten() {
        return kosten;
    }

    public void setKosten(double kosten) {
        this.kosten = kosten;
    }
}
