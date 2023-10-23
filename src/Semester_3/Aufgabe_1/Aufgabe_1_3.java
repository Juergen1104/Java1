package Semester_3.Aufgabe_1;

import static Michelle_2.IOTools.readInteger;

public class Aufgabe_1_3 {

  public static void main(String[] args) {

    int seitenlaenge = readInteger("ganze Zahl eingeben: ");

    double flaeche = berechneFlaeche(seitenlaenge);
    double volumen = berechneVolumen(seitenlaenge);

    System.out.println("Kantenlaenge -->  " + seitenlaenge);
    System.out.println("Oberflaecheninhalt: " + flaeche);
    System.out.println("Volumen: " + volumen);
  }

  // Fläche
  public static double berechneFlaeche(double seitenlaenge) {
    double flaechenfuenfeck = (5 * Math.pow(seitenlaenge, 2)) / (4 * Math.tan(Math.PI / 5));
    double flaechendodekaeder = 12 * flaechenfuenfeck;
    return Math.round(flaechendodekaeder);
  }

  // Funktion Volumens berechnen
  public static double berechneVolumen(double seitenlaenge) {
    double a = seitenlaenge;
    double dodekaederVolumen = (15 + 7 * Math.sqrt(5)) / 4 * Math.pow(a, 3);
    return Math.round(dodekaederVolumen);
  }
}
