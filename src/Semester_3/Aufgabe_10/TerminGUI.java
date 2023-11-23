package Semester_3.Aufgabe_10;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.DecimalFormat;
import javax.swing.*;

public class TerminGUI extends JFrame {
  static final long serialVersionUID = 1L;

  Color color_1 = new Color(240, 255, 240);
  Color color_2 = new Color(224, 238, 224);
  Color color_3 = new Color(255, 218, 185);
  Color color_4 = new Color(255, 239, 219);
  Font font_1 = new Font("Lucid Bright Demibold", Font.BOLD, 14);
  Font font_2 = new Font("Liberation Serif Italic", Font.PLAIN, 12);

  /* Komponenten, mit denen spaeter interagiert wird */
  private JComboBox<String> tage, monate, jahre, stunden, minuten;
  private JTextArea textArea;
  private JTextField tField;
  private JButton button1, button2;

  /* Terminliste */
  private Terminliste tListe = new Terminliste(5);

  /* *** Aufgabe 2: 1. Listenerklasse *** */
  // 3

  /* *** Aufgabe 2: 2. Listenerklasse *** */
  // 3

  /* *** Aufgabe 2: Listener generieren und bei Buttons registrieren */
  // 1
  private void createListener() {}

  /* ********** ab hier nichts mehr aendern ********** */

  public TerminGUI() {
    this.setSize(new Dimension(400, 300));
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.init(); // Oberflaeche zusammenbausen
    this.createListener();
    this.pack();
    this.setVisible(true);
  }

  /* Komponenten erstellen */
  private void init() {
    /* oberen Bereich mit Eingabemöglichekeiten anlegen */
    Box cBox = createChoiceBox();

    /* (unteren) Textbereich anlegen */
    textArea = new JTextArea(20, 50);
    textArea.setBackground(color_4);
    textArea.setFont(font_1);
    textArea.append("\nTermine:\n\n");
    textArea.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

    /* Layout für Content Pane festlegen und mit Text Area und
    den Komponenten für den obreen Bereich füllen */
    this.getContentPane().setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
    this.getContentPane().add(cBox);
    this.getContentPane().add(textArea);
  }

  /* Box fuer oberen Bereich anlegen:
    - Comboboxen fuer Jahre, Monate und Tage sowie Stunden und Minuten
      anlegen
  */
  private Box createChoiceBox() {

    // ********** ComboBox fuer Tage **********
    String[] days = new String[31];
    for (int i = 1; i <= 31; i++) {
      days[i - 1] = String.valueOf(i);
    }
    this.tage = new JComboBox<String>(days);
    this.tage.setBackground(color_1);
    this.tage.setMaximumSize(new Dimension(50, 30));

    // ********** ComboBox fuer Monate **********
    String[] months = {
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
    };
    this.monate = new JComboBox<String>(months);
    this.monate.setBackground(color_1);
    this.monate.setMaximumSize(new Dimension(150, 30));
    this.monate.addItemListener(new MonatComboBoxListener());

    // ********** ComboBox fuer Jahre **********
    String[] years = {"2023", "2024", "2025"};
    this.jahre = new JComboBox<String>(years);
    this.jahre.setBackground(color_1);
    this.jahre.addItemListener(new JahrComboBoxListener());
    this.jahre.setMaximumSize(new Dimension(100, 30));

    // ********** ComboBox fuer Stunden **********
    String[] hours = new String[24];
    for (int i = 0; i < 24; i++) {
      DecimalFormat df = new DecimalFormat("00");
      hours[i] = df.format(i);
    }
    this.stunden = new JComboBox<String>(hours);
    this.stunden.setSelectedIndex(8);
    this.stunden.setBackground(color_1);
    this.stunden.setMaximumSize(new Dimension(50, 30));

    // ********** ComboBox fuer Minuten **********
    String[] minutes = new String[60];
    for (int i = 0; i < 60; i++) {
      DecimalFormat df = new DecimalFormat("00");
      minutes[i] = df.format(i);
    }
    this.minuten = new JComboBox<String>(minutes);
    this.minuten.setSelectedIndex(30);
    this.minuten.setBackground(color_1);
    this.minuten.setMaximumSize(new Dimension(100, 30));

    // ********** Box mit zwei Buttons **********
    Box buttonBox = Box.createHorizontalBox();
    this.button1 = new JButton("Termin anlegen");
    this.button2 = new JButton("Alle Termine anzeigen");
    button1.setBackground(color_2);
    button2.setBackground(color_2);

    Button1Listener button1Listener = new Button1Listener();
    Button2Listener button2Listener = new Button2Listener();

    button1.addActionListener(button1Listener);
    button2.addActionListener(button2Listener);

    buttonBox.add(button1);
    buttonBox.add(Box.createHorizontalStrut(10));
    buttonBox.add(button2);

    /* Jetzt Teile zusammenbauen:
      Je eine Box fuer Datum, Uhrzeit sowie die beiden Buttons erzeugen
      un in einer weiteren Box zusammenfuegen.
    */
    Box dateBox = Box.createVerticalBox(); // Box fuer Datum, Uhrzeit u. Buttons
    dateBox.setOpaque(true);
    dateBox.setBackground(color_3);

    Box box1 = createDatumBox(tage, monate, jahre);
    Box box2 = createUhrzeitBox(stunden, minuten);
    Box box3 = createInhaltsBox();
    dateBox.add(box1);
    dateBox.add(Box.createVerticalStrut(5));
    dateBox.add(box2);
    dateBox.add(Box.createVerticalStrut(5));
    dateBox.add(box3);
    dateBox.add(Box.createVerticalStrut(5));
    dateBox.add(new JSeparator(SwingConstants.HORIZONTAL));
    dateBox.add(Box.createVerticalStrut(5));
    dateBox.add(buttonBox);
    dateBox.add(Box.createVerticalStrut(5));
    dateBox.add(new JSeparator(SwingConstants.HORIZONTAL));
    return dateBox;
  }

  /* Box mit Textbereich generieren */
  private Box createInhaltsBox() {
    Box box = Box.createHorizontalBox();
    JLabel label = new JLabel("Inhalt: ");
    tField = new JTextField();
    tField.setBackground(color_1);
    tField.setFont(font_2);
    tField.setText("Was ist los...");
    tField.setColumns(19);
    tField.setPreferredSize(new Dimension(200, 30));

    box.add(label);
    box.add(Box.createRigidArea(new Dimension(24, 0)));
    box.add(tField);
    box.add(Box.createHorizontalGlue());
    box.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
    return box;
  }

  /* Box fuer Datum generieren */
  private Box createDatumBox(JComboBox tag, JComboBox monat, JComboBox jahr) {
    Box box = Box.createHorizontalBox();
    box.add(new JLabel("Datum: "));
    box.add(Box.createHorizontalStrut(20));
    box.add(tag);
    box.add(Box.createRigidArea(new Dimension(10, 0)));
    box.add(monat);
    box.add(Box.createRigidArea(new Dimension(10, 0)));
    box.add(jahr);
    box.add(Box.createHorizontalGlue());
    box.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
    return box;
  }

  /* Box fuer Uhrzeit generieren */
  private Box createUhrzeitBox(JComboBox stunde, JComboBox minute) {
    Box box = Box.createHorizontalBox();
    box.add(new JLabel("Uhrzeit: "));
    box.add(Box.createHorizontalStrut(14));
    box.add(stunde);
    box.add(new JLabel(" : "));
    box.add(minute);
    box.add(Box.createHorizontalGlue());
    box.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
    return box;
  }

  // Innere Klasse für ActionListener Datum
  private class Button1Listener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      int selectedTag = Integer.parseInt((String) tage.getSelectedItem());
      int selectedMonat = monatText2Int((String) monate.getSelectedItem());
      int selectedJahr = Integer.parseInt((String) jahre.getSelectedItem());
      int selectedStunde = Integer.parseInt((String) stunden.getSelectedItem());
      int selectedMinute = Integer.parseInt((String) minuten.getSelectedItem());
      String enteredText = tField.getText();

      Termin termin =
          new Termin(
              selectedJahr,
              selectedMonat,
              selectedTag,
              selectedStunde,
              selectedMinute,
              enteredText);

      tListe.addTermin(termin);

      Termin termin1 = tListe.getTermin(tListe.getAnzahlTermine());

      String x = termin1.toString();

      textArea.setText("");
      textArea.append("\n neuer Termin:\n\n");
      textArea.append(x + "\n");

      int a = 0;
    }
  }

  private int monatText2Int(String selectedMonat) {

    switch (selectedMonat) {
      case "Januar":
        return 1;
      case "Februar":
        return 2;

      case "März":
        return 3;
      case "April":
        return 4;
      case "Mai":
        return 5;
      case "Juni":
        return 6;
      case "Juli":
        return 7;
      case "August":
        return 8;
      case "September":
        return 9;
      case "Oktober":
        return 10;
      case "November":
        return 11;
      case "Dezember":
        return 12;
      default:
        return 99;
    }
  }

  // Innere Klasse für ActionListener Datum
  private class Button2Listener implements ActionListener {
    public void actionPerformed(ActionEvent e) {

      textArea.setText("");

      if (tListe.getAnzahlTermine() > 0) {
        textArea.append("\n Termine:\n\n");
        tListe.sortTermine();
        for (int i = 1; i < tListe.getAnzahlTermine() + 1; i++) {
          Termin termin = tListe.getTermin(i);
          String terminAusgabe = termin.toString();
          textArea.append(terminAusgabe + "\n");
        }
      } else {
        textArea.append("\n keine Termine:\n\n");
      }

      tListe.sortTermine();
      int anzahl = tListe.getAnzahlTermine();
      for (int i = 1; i < anzahl + 1; i++) {
        Termin termin = tListe.getTermin(i);
        String x = termin.toString();
        textArea.append(x + "\n");
      }
    }
  }

  private class JahrComboBoxListener implements ItemListener {
    @Override
    public void itemStateChanged(ItemEvent e) {
      if (e.getStateChange() == ItemEvent.SELECTED) {

        // String sJahr = (String) e.getItem();
        int sJahr = Integer.parseInt((String) e.getItem());

        // int iJahr = Integer.parseInt(sJahr);

        String sMonat = (String) monate.getSelectedItem();
        int tageMonat = anzahlTageMonat(sJahr, sMonat);
        fillComboboxTage(tageMonat);
      }
    }
  }

  // ItemListener ComboBox Monats
  private class MonatComboBoxListener implements ItemListener {
    @Override
    public void itemStateChanged(ItemEvent e) {
      if (e.getStateChange() == ItemEvent.SELECTED) {
        String sMonat = (String) e.getItem();

        int sJahr = Integer.parseInt((String) jahre.getSelectedItem());

        int tageMonat = anzahlTageMonat(sJahr, sMonat);
        fillComboboxTage(tageMonat);
      }
    }
  }

  private void fillComboboxTage(int tageMonat) {

    tage.removeAllItems();

    String[] days = new String[tageMonat];
    for (int i = 1; i <= tageMonat; i++) {

      tage.addItem(String.valueOf(i));

      //  days[i - 1] = String.valueOf(i);
    }

    // this.tage = new JComboBox<String>(days);
  }

  private int anzahlTageMonat(int sJahr, String sMonat) {
    int anzahlTage = 0;
    boolean istSchaltJahr = sJahr % 4 == 0 && (sJahr % 100 != 0 || sJahr % 400 == 0);

    switch (sMonat) {
      case "Januar":
      case "März":
      case "Mai":
      case "Juli":
      case "August":
      case "Oktobeer":
      case "Dezember":
        anzahlTage = 31;
        break;
      case "Februar":
        anzahlTage = istSchaltJahr ? 29 : 28;
        break;
      default:
        anzahlTage = 30;
        break;
    }
    return anzahlTage;
  }

  public static void main(String[] args) {
    TerminGUI T_GUI = new TerminGUI();
    T_GUI.setVisible(true);
  }
}
