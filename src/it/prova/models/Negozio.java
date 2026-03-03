package it.prova.models;

import java.util.ArrayList;
import java.util.List;

public class Negozio {

    private String ragioneSociale;
    private String partitaIva;
    private List<Lavoratore> lavoratori = new ArrayList<>();
    private List<Item> items = new ArrayList<>();
    private CentroCommerciale centroCommerciale;

    public Negozio(String ragioneSociale, String partitaIva){
        this.ragioneSociale = ragioneSociale;
        this.partitaIva = partitaIva;
    }

    public boolean addToItems(Lavoratore lavoratore, Item item){
        if(!this.getLavoratori().contains(lavoratore) || this.items.contains(item) ){
            return false;
        }
        return lavoratore.handleItemAdd(item);

    }

    public boolean removeFromItems(Lavoratore lavoratore, Item item){
        if(!this.getLavoratori().contains(lavoratore) || !this.items.contains(item)){
            return false;
        }
        return lavoratore.handleItemRemove(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public CentroCommerciale getCentroCommerciale() {
        return centroCommerciale;
    }

    public void setCentroCommerciale(CentroCommerciale centroCommerciale) {
        this.centroCommerciale = centroCommerciale;
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
