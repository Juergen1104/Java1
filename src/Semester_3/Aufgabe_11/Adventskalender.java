package Semester_3.Aufgabe_11;

import javax.swing.JFrame;

public class Adventskalender extends JFrame {

  public Adventskalender() {
    super("Adventskalender 2023");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // einzige Komponente hinzufuegen
    this.getContentPane().add(new Adventspanel());
    this.setLocation(100, 100);
    this.setResizable(false); // Groesse ist fest (unveraenderbar)
    this.pack();
  }

  public static void main(String[] args) {
    Adventskalender aka = new Adventskalender();
    aka.setVisible(true);
  }
}
