package Semester_3.Aufgabe_9;

import java.awt.*;
import javax.swing.*;

public class TerminListe extends JFrame {
  static final long serialVersionUID = 1L;

  private String[] generateIntegerArray(int start, int end) {
    String[] array = new String[end - start + 1];
    for (int i = 0; i <= end - start; i++) {
      array[i] = String.valueOf(start + i);
    }
    return array;
  }

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
    this.setLayout(new FlowLayout());
    init(); // Oberflaeche zusammenbausen
    this.pack();
    this.setVisible(true);
  }

  /* Komponenten erstellen */
  private void init() {

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
    tage = new JComboBox<>(generateIntegerArray(1, 31));
    // ********** ComboBox fuer Monate **********
    monate =
        new JComboBox<>(
            new String[] {
              "Januar",
              "Februar",
              "März",
              "April",
              "Mai",
              "Juni",
              "Juli",
              "August",
              "September",
              "Oktober",
              "November",
              "Dezember"
            });
    // ********** ComboBox fuer Jahre **********
    jahre = new JComboBox<>(new String[] {"2023", "2024", "2025"});

    // ********** ComboBox fuer Stunden **********
    stunden = new JComboBox<>(generateIntegerArray(0, 23));
    // ********** ComboBox fuer Minuten **********
    minuten = new JComboBox<>(generateIntegerArray(0, 59));
    // ********** Box mit zwei Buttons **********

    /* Jetzt Teile zusammenbauen:
      Je eine Box fuer Datum, Uhrzeit sowie die beiden Buttons erzeugen
      un in einer weiteren Box zusammenfuegen.
    */
    Box dateBox = Box.createVerticalBox(); // Box fuer Datum, Uhrzeit u. Buttons

    Box boxDatum = createInhaltsBox();

    JLabel datumLabel = new JLabel("Datum: :");
    boxDatum.add(datumLabel);
    boxDatum.add(tage);
    boxDatum.add(monate);
    boxDatum.add(jahre);

    dateBox.add(boxDatum);

    // ------------------------------------

    Box boxUhrzeit = createInhaltsBox();
    JLabel uhrzeitLabel = new JLabel("Uhrzeit :");
    boxUhrzeit.add(uhrzeitLabel);
    boxUhrzeit.add(stunden);
    boxUhrzeit.add(minuten);

    dateBox.add(boxUhrzeit);

    Box boxTextfeld = createInhaltsBox();
    JLabel inhaltLabel = new JLabel("Inhalt: ");
    boxTextfeld.add(inhaltLabel);
    JTextField inhalt = new JTextField();
    boxTextfeld.add(inhalt);
    dateBox.add(boxTextfeld);

    Box boxButtons = createInhaltsBox();
    button1 = new JButton("Termin anlegen");
    boxButtons.add(button1);
    button2 = new JButton("Alle Termine anzeigen");
    boxButtons.add(button2);
    dateBox.add(boxButtons);

    Box boxTermine = createInhaltsBox();
    JLabel termineText = new JLabel("Termine: ");
    boxTermine.add(termineText);
    textArea = new JTextArea();
    boxTermine.add(textArea);

    dateBox.add(boxTermine);
    this.getContentPane().add(dateBox);
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
