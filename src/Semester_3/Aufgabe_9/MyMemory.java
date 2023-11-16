package Semester_3.Aufgabe_9;

import java.awt.*;
import javax.swing.*;

public class MyMemory extends JFrame {
  private static final int anzZeilen = 4, anzSpalten = 6;
  private Karte[][] kartenFeld = new Karte[anzZeilen][anzSpalten];
  private ZaehlerLabel zaehlerVersuche, zaehlerPaare;

  public MyMemory() {

    //  this.getContentPane().setLayout(new FlowLayout());
    this.getContentPane().setLayout(new GridLayout(4, 6));

    Resources.initFeld(kartenFeld);

    for (int i = 0; i < kartenFeld.length; i++) {
      for (int j = 0; j < kartenFeld[i].length; j++) {

        Karte karte = kartenFeld[i][j];
        KartenButton kb = new KartenButton(kartenFeld[i][j]);
        this.getContentPane().add(kb);
      }
    }

    JLabel fussziele = new JLabel("Anzahl Versuche: ");
    fussziele.setFont(new Font(null, Font.BOLD, 24));
    fussziele.setVerticalTextPosition(JLabel.BOTTOM);
    // this.getContentPane().add(fussziele);

    fussziele = new JLabel("Anzahl Paare: ");
    fussziele.setFont(new Font(null, Font.BOLD, 24));
    fussziele.setVerticalTextPosition(JLabel.BOTTOM);
    // this.getContentPane().add(fussziele);

    /* **************************************************** */

    // initialisiert zufaellige Verteilung der Karten im KartenFeld
    Resources.initFeld(kartenFeld);

    this.setTitle("Memory");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.pack();
    this.setVisible(true);
  }

  public static void main(String[] args) {
    MyMemory mm = new MyMemory();
  }
}
