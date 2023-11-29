package Semester_3.Aufgabe_11;

import java.awt.*;
import java.awt.geom.*;

public class Hintergrundbild {
  // Beispiel-Grundformen
  private static final Shape dreieck;
  private static final Shape dreieck1;
  private static final Shape dreieck2;
  private static final Shape quadrat;
  private static final Shape stern;
  private static final Shape vogel;

  private static final int anzahlFiguren = 8;

  static {
    GeneralPath p = new GeneralPath();
    p.moveTo(0, 30);
    p.lineTo(30, 0);
    p.lineTo(60, 30);
    p.closePath();
    dreieck = p;

    p = new GeneralPath();
    p.moveTo(0, 20);
    p.lineTo(20, 0);
    p.lineTo(40, 20);
    p.closePath();
    dreieck1 = p;

    p = new GeneralPath();
    p.moveTo(0, 10);
    p.lineTo(10, 0);
    p.lineTo(20, 10);
    p.closePath();
    dreieck2 = p;
    p = new GeneralPath();
    p.moveTo(50, 120);
    p.lineTo(70, 180);
    p.lineTo(20, 140);
    p.lineTo(80, 140);
    p.lineTo(30, 180);
    p.closePath();
    stern = p;

    p = new GeneralPath();
    p.moveTo(50, 100);
    p.lineTo(70, 94);
    p.curveTo(100, 60, 140, 130, 160, 130);
    p.lineTo(190, 90);
    p.lineTo(200, 106);
    p.quadTo(100, 200, 70, 110);
    p.closePath();
    vogel = p;

    quadrat = new Rectangle(0, 0, 3, 3);
  }

  private Shape[] teile;
  private Color[] farben;

  // Konstruktor, in dem hier alle zu zeichnenden Objekte erstellt werden
  // w und h geben die Groesse des einzuhaltenden (da sichtbaren)
  // Zeichenbereichs an
  public Hintergrundbild(int w, int h) {
    this.teile = new Shape[anzahlFiguren];
    this.farben = new Color[anzahlFiguren];

    GeneralPath gp = new GeneralPath(dreieck);
    AffineTransform at = new AffineTransform();
    at.translate(50, 400);
    at.scale(5, 4);
    teile[0] = at.createTransformedShape(gp);
    farben[0] = Color.green;

    gp = new GeneralPath(dreieck);
    at = new AffineTransform();
    at.translate(50, 350);
    at.scale(5, 4);
    teile[1] = at.createTransformedShape(gp);
    farben[1] = Color.green;

    gp = new GeneralPath(dreieck1);
    at = new AffineTransform();
    at.translate(100, 310);
    at.scale(5, 4);
    teile[2] = at.createTransformedShape(gp);
    farben[2] = Color.green;

    gp = new GeneralPath(dreieck1);
    at = new AffineTransform();
    at.translate(100, 260);
    at.scale(5, 4);
    teile[3] = at.createTransformedShape(gp);
    farben[3] = Color.green;

    gp = new GeneralPath(dreieck2);
    at = new AffineTransform();
    at.translate(150, 230);
    at.scale(5, 4);
    teile[4] = at.createTransformedShape(gp);
    farben[4] = Color.green;

    gp = new GeneralPath(quadrat);
    at = new AffineTransform();
    at.translate(170, 520);
    at.scale(20, 15);
    teile[5] = at.createTransformedShape(gp);
    farben[5] = Color.gray;

    gp = new GeneralPath(stern);
    at = new AffineTransform();
    at.translate(150, 65);
    teile[6] = at.createTransformedShape(gp);
    farben[6] = Color.red;

    gp = new GeneralPath(vogel);
    at = new AffineTransform();
    at.translate(175, 10);
    //    at.scale(10, 5);
    teile[7] = at.createTransformedShape(gp);
    farben[7] = Color.orange;

    //        gp = new GeneralPath(quadrat);
    //        at = new AffineTransform();
    //        at.translate(100, 390);
    //        at.scale(5, 8);
    //        teile[2] = at.createTransformedShape(gp);
    //        farben[2] = Color.yellow;
  }

  public void paint(Graphics g) {
    Graphics2D g2 = (Graphics2D) g;
    for (int i = 0; i < teile.length; i++) {
      g2.setColor(farben[i]);
      g2.fill(teile[i]);
      g2.setColor(Color.black);
      g2.draw(teile[i]);
    }
  }
}
