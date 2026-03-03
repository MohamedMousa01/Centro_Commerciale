package it.prova.models;

public class Boss extends Lavoratore{

    public Boss(String nome, String cognome){
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
