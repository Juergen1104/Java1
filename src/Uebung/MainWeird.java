package Uebung;

public class MainWeird {

  public static void someBool() {
    boolean x = true, y = false, z = true;
    boolean erg1 = !(x | y) & (x ^ y) | (!z & y) | (x & y & z);
    boolean erg2 = (x | !y) & (y & !z) | (!x & z);

    System.out.println("Ergebnis 1 = " + erg1);
    System.out.println("Ergebnis 2 = " + erg2);
  }

  public static void weird() {
    int a = 0xC0DE; // Hexadez. mit präfix 0x
    int b = 01337; // Oktalzahlen mit Präfix 0
    int c = 0b10101010; // Binärzahlen mit präfix 0b
    int d = 0b1001_0110; // gleiches wie oben _ ist opt. Trennung

    int e = c * 8; // Gespeicherter Wert in c wird mit 8 mult. und in e gespeichert
    int f = c << 3; // an binärzahl c werden 3 0ller bits am ende angehängt Linksshift um 3
    int g = d / 0x10;
    int h = d >> 4; // Rechtsshift um 4 Stellen

    System.out.println("a: " + a);
    System.out.println("b: " + b);
    System.out.println("c: " + c);
    System.out.println("d: " + d);
    System.out.println("e: " + e);
    System.out.println("f: " + f);
    System.out.println("g: " + g);
    System.out.println("h: " + h);
  }

  public static void main(String[] args) {
    weird();
    someBool();
  }
}
