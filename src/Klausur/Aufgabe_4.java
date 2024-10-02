package Klausur;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Aufgabe_4 extends JFrame {
  // Hintergrundfarbe fuer ControlPanel (links)
  private static final Color PANEL_BG = new Color(200, 200, 200);
  // Hoehe der beiden Haupt-Panels
  private static final int PANEL_H = 300;
  // initial angezeiter Text
  private static final String INIT_TEXT = "Klausur!!!";
  // Flag zeigt an, ob Farbe fuer Hintergrund oder Vordergrund (Text)
  // Verwendet wird
  private boolean background = true;

  // Haupt-Panel rechts
  private TextPanel textPanel = new TextPanel();
  // Haupt-Panel links
  private ControlPanel controlPanel = new ControlPanel();
  // Textfelder fuer Rot/Gruen/Blauwerte
  private JTextField rot, gruen, blau;
  // Eingabefeld fuer (neuen) Text
  private JTextArea textInput;
  // Button, mit dem Text neu gesetzt werden soll
  private JButton submit;
  // Combobox mit Font Typen
  private JComboBox<String> styleAuswahl;
  // Combobox mit Font Groessen
  private JComboBox<Integer> groessenAuswahl;

  /*  *** Aufgabenteil (a) *** */

  private void addButtonListener() {}

  /*  *** Aufgabenteil (b) *** */

  private void addColorListener() {}

  /*  *** Aufgabenteil (c) *** */

  private void addClickListener() {}

  /*  *** Aufgabenteil (d) *** */

  private void addFontListener() {}

  /*  *** Aufgabenteil (e) *** */

  private void createFarbPanel(JPanel p) {}

  /* ********************************************** */
  /* ********************************************** */
  /*                                                */
  /*       keine Aenderungen mehr ab hier           */
  /*                                                */
  /* ********************************************** */
  /* ********************************************** */

  public Aufgabe_4() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.createComponents();
    this.addListeners();
    this.pack();
  }

  private void addListeners() {
    this.addButtonListener();
    this.addColorListener();
    this.addFontListener();
    this.addClickListener();
  }

  public void createComponents() {
    Container c = this.getContentPane();
    c.setLayout(new BoxLayout(c, BoxLayout.X_AXIS));
    c.setBackground(PANEL_BG);
    c.add(this.controlPanel);
    c.add(Box.createHorizontalStrut(5));
    c.add(new JSeparator(SwingConstants.VERTICAL));
    this.textPanel.setPreferredSize(new Dimension(400, PANEL_H));
    this.textPanel.setBorder(BorderFactory.createLineBorder(Color.black, 1));
    c.add(this.textPanel);
  }

  /* Panel, in dem ein konfigurierbarer Text angezeigt wird */
  private class TextPanel extends JPanel {
    private Color bgColor = Color.WHITE;
    private Color fgColor = Color.BLACK;
    private String text = new String(INIT_TEXT);
    private Point p = new Point(20, 100);

    /* setzt den Text */
    public void setText(String newText) {
      this.text = newText;
      this.repaint();
    }

    /* setzt die Farbe vom Hintergrund oder vom Vordergrund */
    public void setFarbe(int r, int g, int b) {
      if (background) {
        this.bgColor = new Color(r, g, b);
      } else {
        this.fgColor = new Color(r, g, b);
      }
      this.repaint();
    }

    /* setzt den Fontstil */
    public void setFontStyle(int style) {
      this.setFont(this.getFont().deriveFont(style));
    }

    /* setzt die Fontgroesse */
    public void setFontGroesse(int size) {
      this.setFont(this.getFont().deriveFont((float) size));
    }

    /* legt die linke obere Ecke fuer den Textblock fest */
    public void setPoint(int x, int y) {
      this.p.x = x;
      this.p.y = y;
      this.repaint();
    }

    public void paintComponent(Graphics g) {
      Graphics2D g2 = (Graphics2D) g;
      // antialiasing, um glatte Linien zu erhalten
      // g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

      g.setColor(this.bgColor);
      g.fillRect(0, 0, this.getWidth(), this.getHeight());
      g.setColor(Color.black);
      g.drawRect(0, 0, this.getWidth(), this.getHeight());

      int x = p.x;
      int y = p.y;
      g.setColor(this.fgColor);
      for (String line : this.text.split("\n")) {
        g.drawString(line, x, y += g.getFontMetrics().getHeight() - 2);
      }
    }
  }

  private class ControlPanel extends JPanel {
    public ControlPanel() {
      rot = new JTextField("255");
      gruen = new JTextField("255");
      blau = new JTextField("255");

      for (JTextField tf : new JTextField[] {rot, gruen, blau}) {
        tf.setHorizontalAlignment(JTextField.CENTER);
        tf.setFont(new Font(null, Font.BOLD, 14));
      }
      JPanel farben = new JPanel();
      farben.setLayout(new GridLayout(3, 2, 5, 5));
      farben.setBackground(PANEL_BG);

      JLabel[] labels = {new JLabel("Rot"), new JLabel("Gruen"), new JLabel("Blau")};
      Component[] pFeld = {rot, gruen, blau};
      for (int i = 0; i < 3; i++) {
        farben.add(labels[i]);
        farben.add(pFeld[i]);
      }
      farben.setBorder(
          BorderFactory.createTitledBorder(
              BorderFactory.createLineBorder(Color.BLUE, 1), "Farbe (RGB)"));

      styleAuswahl = new JComboBox<>(new String[] {"plain", "italic", "bold"});
      styleAuswahl.setSelectedIndex(0);
      groessenAuswahl = new JComboBox<>(new Integer[] {10, 20, 30, 40, 50, 60, 70, 80});
      groessenAuswahl.setSelectedIndex(4);
      textPanel.setFontStyle(Font.PLAIN);
      textPanel.setFontGroesse(30);

      JPanel fontAuswahl = new JPanel();
      fontAuswahl.setLayout(new GridLayout(2, 2, 5, 5));
      fontAuswahl.setBackground(PANEL_BG);
      fontAuswahl.setBorder(
          BorderFactory.createTitledBorder(
              BorderFactory.createLineBorder(Color.BLUE, 1), "Font Parameter"));
      fontAuswahl.add(new JLabel("Font Style"));
      fontAuswahl.add(styleAuswahl);
      fontAuswahl.add(new JLabel("Font Size"));
      fontAuswahl.add(groessenAuswahl);

      JPanel textAuswahl = new JPanel();
      textAuswahl.setLayout(new BoxLayout(textAuswahl, BoxLayout.Y_AXIS));
      // textAuswahl.setLayout(new GridLayout(2,1,5,5));
      textInput = new JTextArea(INIT_TEXT);
      JScrollPane scroller = new JScrollPane(textInput);
      // textInput = new JTextField(INIT_TEXT);
      scroller.setPreferredSize(new Dimension(150, 50));
      textAuswahl.add(scroller);
      submit = new JButton("Text eintragen");
      textAuswahl.add(submit);
      textAuswahl.setBackground(PANEL_BG);
      textAuswahl.setBorder(
          BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLUE, 1), "Text"));

      this.setLayout(new GridLayout(4, 1, 5, 5));
      this.add(farben);
      JPanel fp = new JPanel();
      fp.setBackground(PANEL_BG);
      fp.setBorder(
          BorderFactory.createTitledBorder(
              BorderFactory.createLineBorder(Color.BLUE, 1), "Farbe fuer ... "));
      createFarbPanel(fp);
      this.add(fp);
      this.add(fontAuswahl);
      this.add(textAuswahl);
      this.setBackground(PANEL_BG);
    }
  }

  public static void main(String[] args) {
    new Aufgabe_4().setVisible(true);
  }
}
