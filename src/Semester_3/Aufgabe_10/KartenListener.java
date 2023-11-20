package Semester_3.Aufgabe_10;

import java.awt.event.*;

public class KartenListener implements ActionListener {
  private ZaehlerLabel zaehlerVersuche;
  private ZaehlerLabel zaehlerPaare;

  private int count = 0;
  private KartenButton[] buttons = new KartenButton[2];

  public KartenListener(ZaehlerLabel zaehlerVersuche, ZaehlerLabel zaehlerPaare) {
    this.zaehlerVersuche = zaehlerVersuche;
    this.zaehlerPaare = zaehlerPaare;
  }

  // *** Aufgabe (1): Listener implementieren ***
  public void actionPerformed(ActionEvent e) {}
}
