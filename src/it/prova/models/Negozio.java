package it.prova.models;

import java.util.ArrayList;
import java.util.List;

public class Negozio {

    private String ragioneSociale;
    private String partitaIva;
    private List<Lavoratore> lavoratori = new ArrayList<>();
    private List<Item> item = new ArrayList<>();

    public Negozio(String ragioneSociale, String partitaIva){
        this.ragioneSociale = ragioneSociale;
        this.partitaIva = partitaIva;
    }

    public String getPartitaIva() {
        return partitaIva;
    }

    public void setPartitaIva(String partitaIva) {
        this.partitaIva = partitaIva;
    }

    public String getRagioneSociale() {
        return ragioneSociale;
    }

    public void setRagioneSociale(String ragioneSociale) {
        this.ragioneSociale = ragioneSociale;
    }

    public List<Lavoratore> getLavoratori() {
        return lavoratori;
    }

    public void setLavoratori(List<Lavoratore> lavoratori) {
        this.lavoratori = lavoratori;
    }

    @Override
    public String toString() {
        return "Negozio{" +
                "ragioneSociale='" + ragioneSociale + '\'' +
                ", partitaIva='" + partitaIva + '\'' +
                ", lavoratori=" + lavoratori +
                '}';
    }
}
