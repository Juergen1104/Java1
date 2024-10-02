package Klausur;

public class Aufgabe_3 {
  public static void main(String[] args) {
    Paar[] paare = {
      new Paar(5, "epsilon"),
      new Paar(4, "delta"),
      new Paar(4, "Delta"),
      new Paar(8, "theta"),
      new Paar(7, "eta"),
      new Paar(6, "zeta"),
      new Paar(1, "alpha"),
      new Paar(3, "gamma"),
      new Paar(2, "beta")
    };

    /* Anfang auskommentierter Bereich <--------

    AbstrakteMenge m1 = new Menge();
    AbstrakteMenge m2 = new SortierteMenge();
    for (Paar p : paare){
        m1.put(p);
        m2.put(p);
    }

    System.out.println("Inhalt m1: ");
    if (m1 != null){
        System.out.println(m1);
    }
    System.out.println("Inhalt m2: ");
    if (m2 != null){
        System.out.println(m2);
    }

    ---> Ende auskommentierter Bereich */
  }
}
