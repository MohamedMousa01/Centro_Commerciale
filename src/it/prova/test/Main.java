import it.prova.models.*;

import java.sql.SQLOutput;

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

    List<Item> items = new ArrayList<>();
    Item prodotto1 = new Item("1", "telefono", 200, negozio1);
    Item prodotto2 = new Item("2", "pc", 900, negozio1);
    Item prodotto3 = new Item("3", "tv", 1200, negozio1);

    System.out.println("----Inizio test----");
    System.out.println(negozio1.addToItems(commesso1,prodotto1));
    System.out.println(negozio1.addToItems(commesso2,prodotto2));
    System.out.println(negozio1.addToItems(boss,prodotto1));

}
