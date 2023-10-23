package Semester_1.Aufgabe_6;

public class TestPolygon {
  public static void main(String[] args) {

    DrawingPane dp = new DrawingPane(); // Zeichenflaeche generieren

    /* *** Aufgabenteil (d) *** */

    // Muster-Rechteck, welches der Zeichenflaeche hinzugefuegt wird
    Rechteck r = new Rechteck(Farbe.BLAU, -25, -25, 50, 50);
    dp.addShape(r);

    // Muster-Rechtecke, die selbst nicht der DrawingPanel
    // hinzugefuegt werden
    Rechteck r1 = new Rechteck(Farbe.ROT, -205, 150, 25, 25);
    Rechteck r2 = new Rechteck(Farbe.ROT, -205, -175, 25, 25);

    Rechteck[] rechteck = new Rechteck[5];
    rechteck[0] = new Rechteck(r);
    for (int i = 0; i < rechteck.length; i++) {
      if (i == 0) {
        rechteck[i] = new Rechteck(rechteck[i]);
      } else {
        rechteck[i] = new Rechteck(rechteck[i - 1]);
      }
      rechteck[i].scale(1.5, 1.25);
      dp.addShape(rechteck[i]);
    }

    Rechteck[] rechteckRotOben = new Rechteck[10];
    Rechteck[] rechteckRotUnten = new Rechteck[10];

    rechteckRotOben[0] = new Rechteck(r1);
    rechteckRotUnten[0] = new Rechteck(r2);
    int xmove = 20;

    for (int i = 0; i < rechteckRotOben.length; i++) {

      if (i > 0) {
        rechteckRotOben[i] = new Rechteck(rechteckRotOben[i - 1]);
        rechteckRotUnten[i] = new Rechteck(rechteckRotUnten[i - 1]);
      }

      rechteckRotOben[i].move(xmove, 0);
      rechteckRotUnten[i].move(xmove, 0);
      dp.addShape(rechteckRotOben[i]);
      dp.addShape(rechteckRotUnten[i]);
      xmove = 38;
    }

    /* *********************** */

    dp.setVisible(true); // Zeichenflaeche mit Objekten anzeigen
  }
}
