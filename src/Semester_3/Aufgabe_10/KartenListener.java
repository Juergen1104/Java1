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
  public void actionPerformed(ActionEvent e) {

    if (count < 2) {
      buttons[count] = (KartenButton) e.getSource();
      buttons[count].setEnabled(false);
      count++;
      return;
    }
    this.zaehlerVersuche.increase(1);

    if (buttons[0].istPaar(buttons[1])) {
      // karten sind glecih
      buttons[0].entferneKarte();
      buttons[1].entferneKarte();
      this.zaehlerPaare.increase(1);
      count = 0;
      buttons[count] = (KartenButton) e.getSource();
      buttons[count].setEnabled(false);
      count++;

    } else {
      buttons[0].setEnabled(true);
      buttons[0].setSelected(false);

      buttons[1].setEnabled(true);
      buttons[1].setSelected(false);

      count = 0;
      buttons[count] = (KartenButton) e.getSource();
      buttons[count].setEnabled(false);
      count++;
    }
  }
}
