package domaci.Cvijan;

import java.util.ArrayList;

public class Recept {


        private String nazivRecepta;
        private int tezinaRecepta;
        private ArrayList<SastojakRecepta> sastojci;

        public Recept(String nazivRecepta, int tezinaRecepta, ArrayList<SastojakRecepta> sastojci) {
            this.nazivRecepta = nazivRecepta;
            this.tezinaRecepta = tezinaRecepta;
            this.sastojci = sastojci;
        }

        public String getNazivRecepta() {
            return nazivRecepta;
        }

        public void setNazivRecepta(String nazivRecepta) {
            this.nazivRecepta = nazivRecepta;
        }

        public int getTezinaRecepta() {
            return tezinaRecepta;
        }

        public void setTezinaRecepta(int tezinaRecepta) {
            this.tezinaRecepta = tezinaRecepta;
        }

        public ArrayList<SastojakRecepta> getSastojci() {
            return sastojci;
        }

        public void setSastojci(ArrayList<SastojakRecepta> sastojci) {
            this.sastojci = sastojci;
        }
        public void dodajSastojak(SastojakRecepta sastojak) {
            sastojci.add(sastojak);
        }
        public boolean jesuLiIsti (SastojakRecepta s1, SastojakRecepta s2){
            return (s1.getNaziv().equals(s2.getNaziv())) && s1.getCena() == s2.getCena() && s1.getKolicinaSastojaka() == s2.getKolicinaSastojaka();
        }
        public void ukloniSastojak(SastojakRecepta s){
            for (int i = 0; i < sastojci.size(); i++) {
                SastojakRecepta trenutni = sastojci.get(i);
                if (jesuLiIsti(trenutni, s)){
                sastojci.remove(i);
            }
        }
    }
        public String tezinaRecepta(){
            String nivo = "";
            if (tezinaRecepta == 1){
                nivo = "Pocetni nivo";
            } else if (tezinaRecepta == 2) {
                nivo = "Laki nivo";
            } else if (tezinaRecepta == 3) {
                nivo = "Srednji nivo";
            } else if (tezinaRecepta == 4) {
                nivo = "Tezak nivo";
            } else if (tezinaRecepta == 5) {
                nivo = "Majstorski nivo";
            } else {
                nivo = "Uneli ste nepostojeci broj nivoa.";
            } return nivo;
        }


    public double ukupnaCenaRecepta(){
            double sum = 0;
            for (SastojakRecepta sastojakRecepta : sastojci) {
                sum += sastojakRecepta.ukupnaCena();
            } return sum;

        }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Recept{");
        sb.append("nazivRecepta='").append('\n');
        sb.append(", tezinaRecepta=").append(tezinaRecepta).append("\n");
        sb.append(", sastojci=").append(sastojci.get(0).getNaziv());
        for (int i = 1; i < sastojci.size(); i++) {
            sb.append('}');
            sb.append(sastojci.get(i).getNaziv());
        }
        return sb.toString();
    }
}


