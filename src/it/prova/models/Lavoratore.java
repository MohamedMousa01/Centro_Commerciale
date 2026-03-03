package it.prova.models;

public abstract class Lavoratore {

    protected String nome;
    protected String cognome;

    public Lavoratore(String nome, String cognome){
        this.nome = nome;
        this.cognome = cognome;
    }

    public abstract boolean handleItemAdd();
    public abstract boolean handleItemRemove();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    @Override
    public String toString() {
        return "Lavoratore{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                '}';
    }


}
