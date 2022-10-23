package Michelle.Aufgabe_6;

public class Wuerfel {
    private int nr;

    public Wuerfel(int nr) {
        this.nr = nr;
    }

    public Wuerfel() {

    }


    public void werfen() {
    }  // Methode macht nichts;

    public String toString() {
        return "Wuerfel Nr. " + nr;
    }
}

/* *** Aufgabenteil (a) *** */
// 4

class ZahlenWuerfel extends Wuerfel {
    private int anzahlSeiten = 6;
    private int wert;


    public ZahlenWuerfel() {

    }

    public ZahlenWuerfel(int anzal) {


        this.anzahlSeiten = anzal;
        for (int i = 1; i < 4; i++) {

            ZahlenWuerfel zahlenWuerfel = new ZahlenWuerfel(i);
        }
    }

    public void werfen() {
        int x = 1 + (int) (Math.random() * ((anzahlSeiten - 1) + 1));


    }

}


/* *** Aufgabenteil (b) *** */
// 4

