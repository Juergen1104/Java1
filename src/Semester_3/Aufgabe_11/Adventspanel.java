package Semester_3.Aufgabe_11;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.time.LocalDate;
import javax.swing.JPanel;

public class Adventspanel extends JPanel {

  private static BufferedImage[] bilder;

  static {
    bilder = ImageLoader.loadImages("src/Semester_3/Aufgabe_11/bilder");
  }

  private static final int w = 400, h = 600; // feste Groesse fuer das Panel
  private Tuerchen[] tuerchen = new Tuerchen[24]; // Feld fuer 24 "Tuerchen"
  private Hintergrundbild hintergrundbild = new Hintergrundbild(w, h);

  public Adventspanel() {
    this.addMouseListener(new MouseListener());
    this.setPreferredSize(new Dimension(w, h));
    this.createTuerchen();
  }

  public void paintComponent(Graphics g) {
    // Hintergrund(bild) zeichnen
    paintBackground(g);

    // Tuerchen zeichnen
    for (int i = 0; i < this.tuerchen.length; i++) {
      if (tuerchen[i] != null) {
        this.tuerchen[i].paint(g);
      }
    }
  }

  private void paintBackground(Graphics g) {
    int w = this.getWidth();
    int h = this.getHeight();
    g.setColor(Color.black);
    g.fillRect(0, 0, w, h);
    this.hintergrundbild.paint(g);
  }

  /* generiert 24 Tuerchen der Groesse 60x60 und verteilt diese
     in 6 Zeilen mit 4 Spalten.
     Die Tuerchen werden im Feld tuerchen gespeichert
  */
  private void createTuerchen() {
    int z = 0;
    for (int i = 1; i <= 4; i++) {
      for (int j = 1; j <= 6; j++) {
        this.tuerchen[z] =
            new Tuerchen((i - 1) * 6 + j, (i - 1) * 80 + 50, (j - 1) * 100 + 30, 60, 60, bilder[z]);
        z++;
      }
    }
  }

  private class Tuerchen extends Rectangle {
    LocalDate oeffnenAm; // Datum fuer einen Tag in der Adventszeit
    BufferedImage img; // Bild
    Boolean tuerchenOffen = false;

    // Tuerchen fuer einen bestimmten Tag im (aktuellen) Dezember
    // generieren und dabei ein vorgegebenes Bild nutzen
    public Tuerchen(int tag, int x, int y, int w, int h, BufferedImage img) {
      super(x, y, w, h);
      LocalDate ld = LocalDate.now();
      this.oeffnenAm = LocalDate.of(ld.getYear(), 12, tag);
      this.img = img;
    }

    // 2*P
    public void oeffnen() {
      LocalDate heute = LocalDate.now();
      LocalDate heuteCompare =
          LocalDate.of(heute.getYear(), heute.getMonth(), heute.getDayOfMonth());
      boolean canBeOpened = heuteCompare.isAfter(oeffnenAm) || heuteCompare.isEqual(oeffnenAm);
      if (canBeOpened) {
        tuerchenOffen = true;
      }
    }

    // Tuerchen zeichnen
    // 6*P
    public void paint(Graphics g) {
      Graphics2D g2 = (Graphics2D) g;
      if (tuerchenOffen) {
        // if (tuerchenOffen || this.oeffnenAm.getDayOfMonth() < 24) {
        g2.setColor(Color.white);
        g2.drawImage(tuerchen[oeffnenAm.getDayOfMonth()].img, x, y, this.width, this.height, null);
      } else {

        g2.setStroke(
            new BasicStroke(
                1, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[] {5}, 0));
        g2.setColor(Color.white);
        // Zeichne den Tag auf die geschlossene Tür.
        g2.drawString(Integer.toString((this.oeffnenAm).getDayOfMonth()), x + 5, y + 15);
        g2.drawRect(this.x, this.y, this.width, this.height);
      }
    }
  }

  // Listener Klasse
  // 4*P
  private class MouseListener extends MouseAdapter {

    public void mausKlick(MouseEvent e) {

      for (Tuerchen tuer : tuerchen) {
        if (tuer.contains(e.getPoint())) {
          tuer.tuerchenOffen = true;
          repaint();
          break; // schluss, da nur ein Klick
        }
      }
    }
  }
}
