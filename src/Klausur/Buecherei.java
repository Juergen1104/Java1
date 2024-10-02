package Klausur;

class Buecherei {
  private static final int N = 100;
  private BuechereiBuch[] buecher = new BuechereiBuch[N];
  private int count = 0; // Index-Zaehler fuer den Eintrag eines neuen Buchs

  public static void main(String[] args) {
    /*  Testdaten */
    String name = "Tom Schmidt";
    String[] autoren = {
      "Henning Mankell",
      "J.R.R Tolkien",
      "Nele Neuhaus",
      "Christoph Marzi",
      "Joerg Maurer",
      "Jonathan Stroud"
    };
    String[] titel = {
      "Wallanders erster Fall",
      "Der Herr der Ringe",
      "Im Wald",
      "Lycidas: Die Uralte Metropole",
      "Foehnlage",
      "Bartimaeus: das Amulett von Samarkand"
    };
    String[] genres = {"Krimi", "Fantasy"};

    /*   *** Beginn Blockkommentar <---

    //  Feld mit 6 Buechern generieren
    Buch[] buecher= new Buch[6];
    for (int i=0;i<6;i++){
        buecher[i] = new Buch(autoren[i],titel[i],genres[i%2]);
    }

    // Buecherei mit 6 Buechern generieren
    Buecherei buecherei = new Buecherei();
    for (Buch b : buecher){
        buecherei.insert(new BuechereiBuch(b));
    }

    // Ausgabe aller vorhandenen Buecher
    System.out.println("---------- Alle vorhandenen Buecher: ----------");
    buecherei.ausgabe(true);

    // ausleihen der ersten beiden Krimis, die noch nicht von <name>
    //   ausgeliehen wurden
    BuechereiBuch[] auswahl = buecherei.getBuecher("Krimi",name);
    for (BuechereiBuch b : auswahl){
        if (b != null){
    	buecherei.ausleihen(b,name);
        }
    }
    // Ausgabe aller ausgeliehenen Buecher
    System.out.println("---------- Alle ausgeliehenen Buecher: ----------");
    buecherei.ausgabe(false);

    // alle von <name> ausgeliehenen Buecher zurueckgeben
    for (BuechereiBuch b : auswahl){
        if (b != null){
    	buecherei.zurueckgeben(b);
        }
    }

    // neue Krimis fuer <name> suchen
    auswahl = buecherei.getBuecher("Krimi",name);
    // neue Buecher ausleihen
    for (BuechereiBuch b : auswahl){
        if (b != null){
    	buecherei.ausleihen(b,name);
        }
    }

    // Ausgabe aller ausgeliehenen Buecher
    System.out.println("---------- Alle ausgeliehenen Buecher: ----------");
    buecherei.ausgabe(false);

           --> Ende Blockkommentar *** */
  }
}
