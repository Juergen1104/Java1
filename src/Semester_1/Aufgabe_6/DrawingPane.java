package Semester_1.Aufgabe_6;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class DrawingPane extends JFrame {
  ArrayList<Polygon> vListe = new ArrayList<Polygon>();

  public DrawingPane() {
    this.setTitle("Simple Drawing Pane");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.getContentPane().add(new CoordPanel());
    this.getContentPane().setPreferredSize(new Dimension(400, 400));
    this.pack();
    this.setResizable(false);
    this.addMouseListener(
        new MouseAdapter() {
          public void mouseClicked(MouseEvent e) {
            System.out.println("x = " + e.getX() + "  y = " + e.getY());
          }
        });
  }

  public void addShape(Polygon v) {
    vListe.add(v);
  }

  public void showWindow() {
    this.setVisible(true);
  }

  private class CoordPanel extends JPanel {

    public void paint(Graphics g) {
      Graphics2D g2 = (Graphics2D) g;
      g2.setStroke(new BasicStroke(2));
      g2.setRenderingHint(
          RenderingHints.KEY_ANTIALIASING,
          RenderingHints.VALUE_ANTIALIAS_ON); // antialiasing, um glatte Linien zu erhalten
      g2.clearRect(0, 0, 400, 400);
      // y-Achse spiegeln (laeuft jetzt nach "oben")
      g2.scale(1.0, -1.0);
      // verschieben des Nullpunkts in die Mitte
      g2.translate(200, -200);
      g2.setColor(Color.black);
      g2.drawLine(-200, 0, 200, 0); // x-Achse
      g2.drawLine(0, 200, 0, -200); // y-Achse
      Iterator<Polygon> it = vListe.iterator();
      g2.setColor(Color.blue);
      while (it.hasNext()) {
        Polygon polygon = it.next();
        Punkt[] pkte = polygon.getEcken();
        int n = pkte.length;
        int[] xCoord = new int[n];
        int[] yCoord = new int[n];
        for (int i = 0; i < pkte.length; i++) {
          xCoord[i] = (int) Math.round(pkte[i].getX());
          yCoord[i] = (int) Math.round(pkte[i].getY());
        }
        java.awt.Polygon pl = new java.awt.Polygon(xCoord, yCoord, n);
        switch (polygon.getFarbe()) {
          case SCHWARZ:
            g2.setColor(Color.BLACK);
            break;
          case ROT:
            g2.setColor(Color.RED);
            break;
          case GRUEN:
            g2.setColor(Color.GREEN);
            break;
          case BLAU:
            g2.setColor(Color.BLUE);
            break;
          default:
            g2.setColor(Color.BLACK);
            break;
        }
        g2.draw(pl);
      }
    }
  }
}
