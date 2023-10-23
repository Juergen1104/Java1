package Semester_1.Aufgabe_6;

enum Farbe {
  SCHWARZ,
  ROT,
  GRUEN,
  BLAU
};

// 5
public class Polygon {
  public Punkt[] ecken;
  private Farbe farbe = Farbe.SCHWARZ;

  /* ***  Aufgabenteil (b)  *** */

  public Polygon() {}

  public Polygon(Punkt[] ecken) {

    this.ecken = new Punkt[ecken.length];
    int i = 0;
    for (Punkt punkt : ecken) {
      this.ecken[i] = new Punkt(punkt.getX(), punkt.getY());
      i++;
    }
  }

  public Polygon(Farbe farbe, Punkt[] ecken) {
    this(ecken);
    this.farbe = farbe;
  }

  public Polygon(Polygon polygon) {
    this(polygon.ecken);
    this.farbe = polygon.farbe;
  }

  public Punkt[] getEcken() {
    return this.ecken;
  }

  public Farbe getFarbe() {
    return this.farbe;
  }

  public void setFarbe(Farbe farbe) {
    this.farbe = farbe;
  }

  public void move(double x, double y) {
    Punkt ecken[] = getEcken();
    for (Punkt punkt : ecken) {
      punkt.move(x, y);
    }
  }

  public void scale(double x, double y) {
    Punkt ecken[] = getEcken();
    for (Punkt punkt : ecken) {
      punkt.scale(x, y);
    }
  }
}
