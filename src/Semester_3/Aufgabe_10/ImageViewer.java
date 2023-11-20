package Semester_3.Aufgabe_10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ImageViewer extends JFrame {
  ImagePanel ip;

  public ImageViewer() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    createMenu();
    createComponents();
    this.setLocation(100, 100);
    this.pack();
  }

  private void createComponents() {
    Container c = this.getContentPane();
    this.ip = new ImagePanel(400, 300);
    JScrollPane sc = new JScrollPane(ip);
    c.add(sc);
  }

  /* *** Aufgabe 3 *** */
  private void createMenu() {}

  public static void main(String[] args) {
    ImageViewer iv = new ImageViewer();
    iv.setVisible(true);
  }
}
