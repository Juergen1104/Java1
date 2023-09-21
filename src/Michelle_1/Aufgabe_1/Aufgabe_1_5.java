package Michelle_1.Aufgabe_1;

public class Aufgabe_1_5 {

    public static void main(String[] args) {

        int zahl1 = readInt4();  // vierstellige ganze Zahl einlesen
        int zahl2 = readInt4();  // vierstellige ganze Zahl einlesen
        int zahl3 = readInt4();  // vierstellige ganze Zahl einlesen

        int maximum;
        int minimum;

        minimum = (zahl1 < zahl2) ? zahl1 : zahl2;
        minimum = (minimum < zahl3) ? minimum : zahl3;

        maximum = (zahl1 > zahl2) ? zahl1 : zahl2;
        maximum = (maximum > zahl3) ? maximum : zahl3;

        int differenz = maximum - minimum;

        System.out.println(differenz);
    }


    /* Methode liest eine vierstellige Zahl ein */
    public static int readInt4() {
        int x = 0;
        x = IOTools.readInteger("ganze Zahl eingeben: ");
        return x;
    }
}
