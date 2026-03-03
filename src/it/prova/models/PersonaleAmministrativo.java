package it.prova.models;

public class PersonaleAmministrativo extends Lavoratore{


    public PersonaleAmministrativo(String nome, String cognome, Negozio negozio){
        super(nome, cognome, negozio);
    }

    @Override
    public boolean handleItemAdd(Item item) {
        return false;
    }

    @Override
    public boolean handleItemRemove(Item item) {
        return false;
    }


}
