package Michelle_1.Aufgabe_2_Loesung;

public class Aufgabe_2_4 {

    // 1.5
    // naechsten Tausch von Bechern festlegen
    public static String nextSwap() {
        // ganzzahlige Zufallszahl aus dem Intervall [1,6]
        int zufall = (int) (Math.random() * 6) + 1;
        String action = "";  // gibt an, welche Becher getauscht werden sollen
        // Meldung
        String meldung = "";

        switch (zufall) {
            case 1:
                action = "ab";
                meldung = "Tausche A mit B";
                break;
            case 2:
                action = "ba";
                meldung = "Tausche B mit A";
                break;
            case 3:
                action = "ac";
                meldung = "Tausche A mit C";
                break;
            case 4:
                action = "ca";
                meldung = "Tausche C mit A";
                break;
            case 5:
                action = "bc";
                meldung = "Tausche B mit C";
                break;
            case 6:
                action = "cb";
                meldung = "Tausche C mit B";
                break;
            default:
                System.out.println("Wert " + zufall + "liegt nicht im Wertebereich von 1 - 6");
                break;
        }

        System.out.println(meldung);
        return action;
    }

    // 1
    // Position der Kugel bestimmen
    public static int getPosition(char a, char b, char c) {
        int pos = 0;

        if (a == 'x') {
            pos = 1;
        } else if (b == 'x') {
            pos = 2;
        } else pos = 3;
        return pos;
    }


    // 1.5
    // Position der Kugel raten
    public static int guess() {
        int pos = 0;
        String text = "Bitte eine Zahl zwischen 1 und 3 eingeben ";
        do {
            pos = IOTools.readInteger(text);
            System.out.println(pos);
        } while ((pos < 0 || pos > 4));
        return pos;
    }


    // 3
    public static void main(String[] args) {
        // Initialisierung der Becher (a und c leer, b belegt)
        char a = '-', b = 'x', c = '-';
        char helper;

        for (int i = 1; i <= 7; i++) {
            String action = nextSwap();
//            System.out.println("vor  dem tausch Action = : " + action + " " + a + " " + b + " " + c);
            switch (action) {

                case "ab", "ba":
                    helper = b;
                    b = a;
                    a = helper;
                    break;
                case "ac", "ca":
                    helper = c;
                    c = a;
                    a = helper;
                    break;
                case "bc", "cb":
                    helper = b;
                    b = c;
                    c = helper;
                    break;
                default:
                    break;
            }
//            System.out.println("nach dem tausch Action = : " + action + " " + a + " " + b + " " + c);
        }


        int guessPos = guess();
        int truePos = getPosition(a, b, c);

        if (guessPos == truePos) {
            System.out.println("Glückwunsch! Richtig geraten!");
        } else {
            System.out.println("Leider falsch! Die richtige Position ist " + truePos);
        }
        System.out.println(a + " " + b + " " + c);
    }

}
