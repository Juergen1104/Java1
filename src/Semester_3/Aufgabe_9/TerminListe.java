package Semester_3.Aufgabe_9;

import java.awt.*;
import javax.swing.*;

public class TerminListe extends JFrame {
  static final long serialVersionUID = 1L;

  /* Farben und Fonts */
  Color color_1;
  Font font_1;

  /* Komponenten, mit denen spaeter interagiert wird */
  private JComboBox<String> tage, monate, jahre, stunden, minuten;
  private JTextArea textArea;
  private JButton button1, button2;

  public TerminListe() {
    super("Terminkalender");
    this.setSize(new Dimension(400, 300));
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    init(); // Oberflaeche zusammenbausen
    this.pack();
    this.setVisible(true);
  }

  /* Komponenten erstellen */
  private void init() {

    /* **************************************************** */
    /*         Dummy Eintrag: muss geloescht werden         */
    /* **************************************************** */
    JLabel l = new JLabel("To be filled ............");
    l.setFont(new Font(null, Font.BOLD, 24));
    l.setBorder(BorderFactory.createEmptyBorder(20, 50, 20, 50));
    this.getContentPane().add(l);
    /* **************************************************** */

    /* oberen Bereich mit Eingabemoeglichkeiten anlegen */
    Box cBox = createChoiceBox();

    /* (unteren) Textbereich anlegen */

    /* Layout für Content Pane festlegen und mit Text Area und
    den Komponenten für den obreen Bereich füllen */

  }

  /* Box fuer oberen Bereich anlegen:
    - Comboboxen fuer Jahre, Monate und Tage sowie Stunden und Minuten
      anlegen
  */
  private Box createChoiceBox() {

    // ********** ComboBox fuer Tage **********

    // ********** ComboBox fuer Monate **********

    // ********** ComboBox fuer Jahre **********

    // ********** ComboBox fuer Stunden **********

    // ********** ComboBox fuer Minuten **********

    // ********** Box mit zwei Buttons **********

    /* Jetzt Teile zusammenbauen:
      Je eine Box fuer Datum, Uhrzeit sowie die beiden Buttons erzeugen
      un in einer weiteren Box zusammenfuegen.
    */
    Box dateBox = Box.createVerticalBox(); // Box fuer Datum, Uhrzeit u. Buttons

    return dateBox;
  }

  /* Box mit Textbereich generieren */
  private Box createInhaltsBox() {
    Box box = Box.createHorizontalBox();

    return box;
  }

  /* Box fuer Datum generieren */
  private Box createDatumBox(JComboBox tag, JComboBox monat, JComboBox jahr) {
    Box box = Box.createHorizontalBox();

    return box;
  }

  /* Box fuer Uhrzeit generieren */
  private Box createUhrzeitBox(JComboBox stunde, JComboBox minute) {
    Box box = Box.createHorizontalBox();

    return box;
  }

  /* Box mit Combobox und Label davor generieren */
  private Box createBoxWithLabel(JComboBox cBox, String lName) {
    Box box = Box.createHorizontalBox();

    return box;
  }

  public static void main(String[] args) {
    TerminListe liste = new TerminListe();
    liste.setVisible(true);
  }
}
