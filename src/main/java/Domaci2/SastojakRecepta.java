package domaci.Cvijan;

public class SastojakRecepta extends Sastojak{
    private double kolicinaSastojaka;

    public SastojakRecepta(String naziv, double cena, double kolicina){
        super(naziv, cena);
        this.kolicinaSastojaka = kolicina;
    }

    public double getKolicinaSastojaka() {
        return kolicinaSastojaka;
    }

    public void setKolicinaSastojaka(double kolicinaSastojaka) {
        this.kolicinaSastojaka = kolicinaSastojaka;
    }
    public double ukupnaCena(){
        return this.kolicinaSastojaka * super.getCena();
    }
}
