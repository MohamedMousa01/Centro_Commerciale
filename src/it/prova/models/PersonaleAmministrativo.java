package it.prova.models;

public class PersonaleAmministrativo extends Lavoratore{


    public PersonaleAmministrativo(String nome, String cognome){
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
