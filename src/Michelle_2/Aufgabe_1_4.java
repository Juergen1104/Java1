package Michelle_2;

import static Michelle_2.IOTools.readDouble;

public class Aufgabe_1_4 {

    public static void main(String[] args) {

        int anzahlBits = eingabe();
        System.out.println(anzahlBits);

        int megabyte = anzahlBits / (1024 * 1024 * 8); // 1 Megabyte = 1024 Kilobyte, 1 Kilobyte = 1024 Byte
        int rest1 = anzahlBits % (1024 * 1024 * 8);

        int kilobyte = rest1 / (1024 * 8);
        int byteRest = rest1 % (1024 * 8);

        int bitrest = byteRest / 8;
        int rest2 = byteRest % 8;

        System.out.println(megabyte + " Mebibyte, " + kilobyte + " Kibibyte, " + bitrest + " Byte und " + rest2 + " Bit");
    }

    public static int eingabe() {
        double x = 0;
        do {
            x = readDouble("Zahl eingeben: ");
            System.out.println(x);
        } while (x > 2147483647);
        return (int) x;
    }
}
