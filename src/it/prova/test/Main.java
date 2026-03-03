import it.prova.models.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    CentroCommerciale centroCommerciale = new CentroCommerciale("Romaest srl", "Via Collatina 200");

    Negozio negozio1 = new Negozio("ZARA srl", "IT12345678901");
    Negozio negozio2 = new Negozio("Nike srl", "IT12345678872");

    List<Lavoratore> lavoratori = new ArrayList<>();

    Lavoratore commesso1 = new Commesso("Marco", "Bianchi", negozio1);
    Lavoratore commesso2 = new Commesso("Giulia", "Verdi", negozio2);
    Lavoratore commesso3 = new Commesso("Valerio", "Bianchi", negozio1);

    Lavoratore personaleAmm1 = new PersonaleAmministrativo("Amministratore", "Ming", negozio1);
    Lavoratore boss = new Boss("Boss", "Capo", negozio1);

    lavoratori.add(commesso1);
    lavoratori.add(commesso2);
    lavoratori.add(commesso3);
    lavoratori.add(personaleAmm1);
    lavoratori.add(boss);





}
