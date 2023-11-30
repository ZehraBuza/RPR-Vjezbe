package org.example;
import java.util.ArrayList;

public class InformacijeONastavniku extends LicneInformacije implements InterfejsPredstavi {
    private String titula;
    private ArrayList<Ocjena> ocjene;

    public String getTitula() {
        return titula;
    }

    public void setTitula(String titula) {
        this.titula = titula;
    }

    public ArrayList<Ocjena> getOcjene() { return ocjene; }

    public void setOcjene(ArrayList<Ocjena> ocjene) {
        this.ocjene = ocjene;
    }

    @Override
    public String predstavi() {
        return getTitula() + " " + getIme() + " " + getPrezime();
    }
         @Override
    public Ocjena ocijeni(int x) {
        Ocjena novaOcjena;

        LicneInformacije informacijeONastavniku = new LicneInformacije();
        informacijeONastavniku.setIme("Zehra");
        informacijeONastavniku.setPrezime("Buza");

        novaOcjena = new Ocjena(informacijeONastavniku, x);
        novaOcjena.setOcjena(x);

        listaOcjena.add(novaOcjena);

        return novaOcjena;
    
    }
}
