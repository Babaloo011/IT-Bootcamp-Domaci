package domaci.Cvijan;

public class Sastojak {

    private String naziv;
    private double cena;

    public Sastojak(String naziv, double cena) {
        this.naziv = naziv;
        this.cena = cena;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cenaSastojka) {
        this.cena = cena;
    }

}
