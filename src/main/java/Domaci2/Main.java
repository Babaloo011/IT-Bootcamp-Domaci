package domaci.Cvijan;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Sastojak jaja = new Sastojak("Jaja", 15.5);
        Sastojak mleko = new Sastojak("Mleko", 0.1);
        Sastojak brasno = new Sastojak("Brasno", 0.075);

        //System.out.println(jaja.getCena());
        SastojakRecepta cetriJaja = new SastojakRecepta(jaja.getNaziv(), jaja.getCena(), 4);
        //System.out.println(cetriJaja.ukupnaCena());
        SastojakRecepta cetvrtLitareMleka = new SastojakRecepta(mleko.getNaziv(), mleko.getCena(), 250);
        SastojakRecepta polaKgBrasna = new SastojakRecepta(brasno.getNaziv(), brasno.getCena(), 500);

        ArrayList<SastojakRecepta> sastojci = new ArrayList<>();
        Recept piroske = new Recept("Slane piroske", 2, sastojci);
        sastojci.add(cetriJaja);
        sastojci.add(cetvrtLitareMleka);
        sastojci.add(polaKgBrasna);

        System.out.println(piroske);
        //System.out.println(palacinke.ukupnaCenaRecepta());

    }
}

