package Semester_3.Aufgabe_12;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Aufgabe_2 extends JFrame {

  private JTextField jahre = new JTextField(" 2023 ");
  private JTextArea ausgabe = new JTextArea();

  public Aufgabe_2() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.createComponents();
    this.createListener();
    this.setLocation(200, 200);
    this.pack();
  }

  private void createComponents() {
    Font f1 = new Font(null, Font.PLAIN, 20);
    Container c = this.getContentPane();
    JPanel p1 = new JPanel();
    p1.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
    jahre.setFont(f1);
    p1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    JLabel jahrLabel = new JLabel("Jahr: ");
    jahrLabel.setFont(f1);
    p1.add(jahrLabel);
    p1.add(jahre);

    JPanel p2 = new JPanel();
    ausgabe.setFont(new Font(null, Font.PLAIN, 14));

    ausgabe.setBorder(BorderFactory.createEmptyBorder(20, 10, 20, 10));
    JScrollPane scroller = new JScrollPane(ausgabe);
    scroller.setPreferredSize(new Dimension(250, 400)); // vergroessert
    p2.add(scroller);
    c.add(p1, BorderLayout.NORTH);
    c.add(p2, BorderLayout.CENTER);
  }

  private void anzeigenMonateTage() {

    StringBuffer buffer = new StringBuffer();
    int jahr = 0;

    try {
      jahr = Integer.parseInt(jahre.getText().trim());
    } catch (NumberFormatException e) { // wenn man sich vertippt
      buffer.append("Ungültige Eingabe!").append("\n");
      ausgabe.setText(buffer.toString());
      return;
    }

    buffer.append("Jahr: ").append(jahr).append("\n");
    buffer.append("************").append("\n"); // hübscher
    buffer.append(" ").append("\n");

    for (Monat monat : Monat.values()) {
      int tage = monat.getAnzahlTageMonat(jahr);
      buffer.append(monat).append(": ").append(tage).append(" Tage\n");
    }
    ausgabe.setText(buffer.toString());
  }

  private void createListener() {
    // Aufgabe 2b
    // 0.5 P
    jahre.addKeyListener(new EingabeListener());
  }

  // Aufgabe 2b
  // 2.5 P
  private class EingabeListener implements KeyListener {
    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
      if (e.getKeyCode() == KeyEvent.VK_ENTER) {
        anzeigenMonateTage();
      }
    }

    @Override
    public void keyReleased(KeyEvent e) {}
  }

  public static void main(String[] args) {
    Aufgabe_2 a2 = new Aufgabe_2();
    a2.setVisible(true);
  }
}
