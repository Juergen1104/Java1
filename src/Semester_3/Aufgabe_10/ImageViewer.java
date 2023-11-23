package Semester_3.Aufgabe_10;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
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
  private void createMenu() {

    JMenuBar menuBar = new JMenuBar();
    JMenu fileMenu = new JMenu("File");
    JMenuItem loadImageItem = new JMenuItem("Bild laden");

    loadImageItem.addActionListener(
        new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            JFileChooser fileChooser = new JFileChooser();

            int result = fileChooser.showOpenDialog(ImageViewer.this);

            if (result == JFileChooser.APPROVE_OPTION) {
              File selectedFile = fileChooser.getSelectedFile();
              ip.setImage(selectedFile);
            }
          }
        });
    fileMenu.add(loadImageItem);
    menuBar.add(fileMenu);
    setJMenuBar(menuBar);
  }

  public static void main(String[] args) {
    ImageViewer iv = new ImageViewer();
    iv.setVisible(true);
  }
}
