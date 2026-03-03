package it.prova.models;

public abstract class Lavoratore {

    protected String nome;
    protected String cognome;
    protected Negozio negozio;

    public Lavoratore(String nome, String cognome, Negozio negozio){
        this.nome = nome;
        this.cognome = cognome;
        this.negozio = negozio;
    }

    public abstract boolean handleItemAdd(Item item);
    public abstract boolean handleItemRemove(Item item);

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
