package Semester_3.Aufgabe_9;

import java.awt.*;
import javax.swing.*;

public class MyMemory extends JFrame {
  private static final int anzZeilen = 4, anzSpalten = 6;
  private Karte[][] kartenFeld = new Karte[anzZeilen][anzSpalten];
  private ZaehlerLabel zaehlerVersuche, zaehlerPaare;

  public MyMemory() {
    /* **************************************************** */
    /*         Dummy Eintrag: muss geloescht werden         */
    /* **************************************************** */
    JLabel l = new JLabel("To be filled ............");
    l.setFont(new Font(null, Font.BOLD, 24));
    l.setBorder(BorderFactory.createEmptyBorder(20, 50, 20, 50));
    this.getContentPane().add(l);
    /* **************************************************** */

    // initialisiert zufaellige Verteilung der Karten im KartenFeld
    Resources.initFeld(kartenFeld);

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.pack();
    this.setVisible(true);
  }

  public static void main(String[] args) {
    MyMemory mm = new MyMemory();
  }
}
