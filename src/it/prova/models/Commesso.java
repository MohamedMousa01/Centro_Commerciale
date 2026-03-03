package it.prova.models;

public class Commesso extends Lavoratore{

    public Commesso(String nome, String cognome){
        super(nome, cognome);
    }

    @Override
    public boolean handleItemAdd() {
        return false;
    }

    @Override
    public boolean handleItemRemove() {
        return false;
    }
}
