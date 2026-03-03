package it.prova.models;

public class Commesso extends Lavoratore{

    public Commesso(String nome, String cognome, Negozio negozio){
        super(nome, cognome,negozio);
    }

    @Override
    public boolean handleItemAdd(Item item) {
        this.negozio.getItems().add(item);
        return true;
    }

    @Override
    public boolean handleItemRemove(Item item) {
        this.negozio.getItems().remove(item);
        return true;
    }
}
