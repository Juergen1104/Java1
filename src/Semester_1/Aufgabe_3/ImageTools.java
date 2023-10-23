package Semester_1.Aufgabe_3;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageTools {

  // generiert ein Grauwertbild aus einem zweidimensionalen Feld
  // von int-Wertem. Werte kleiner als 0 werden auf 0 gesetzt
  // und Werte groesser als 255 werden auf 255 gesetzt.
  // es wird vorausgesetzt, dass alle Zeilen die gleiche Laenge
  // haben.
  public static BufferedImage createImage(int[][] data) {
    BufferedImage img = new BufferedImage(data[0].length, data.length, BufferedImage.TYPE_INT_RGB);
    for (int i = 0; i < data.length; i++) {
      for (int j = 0; j < data[i].length; j++) {
        if (data[i][j] < 0) {
          data[i][j] = 0;
        }
        if (data[i][j] > 255) {
          data[i][j] = 255;
        }
        int rgb = new Color(data[i][j], data[i][j], data[i][j]).getRGB();
        img.setRGB(j, i, rgb);
      }
    }

    return img;
  }

  /* wie Methode zuvor, nur als Farbbild (int Werte werden direkt
  übernommen */
  public static BufferedImage createColorImage(int[][] data) {
    BufferedImage img = new BufferedImage(data[0].length, data.length, BufferedImage.TYPE_INT_RGB);
    for (int i = 0; i < data.length; i++) {
      for (int j = 0; j < data[i].length; j++) {

        img.setRGB(j, i, data[i][j]);
      }
    }

    return img;
  }

  // schreibt das Bild mit dem namen filname (im png Format)
  // in das aktuelle Verzeichnis
  // Es wird vorausgesetzt, dass der Dateiname kein Verzeichnis
  // beinhaltet
  public static void writeImage(BufferedImage img, String filename) {
    String dir = System.getProperty("user.dir");
    try {
      File file = new File(dir, filename);
      ImageIO.write(img, "png", file);
    } catch (IOException | IllegalArgumentException e) {
      System.out.println("Could not write image " + filename);
    }
  }

  // liest ein Bild aus der Datei mit dem namen filename
  // Abbruch, wenn die Datei nicht gefunden bzw. gelesen werden kann
  public static BufferedImage readImage(String filename) {
    BufferedImage img = null;
    File file;
    try {
      file = new File(filename);
      img = ImageIO.read(file);
    } catch (IOException e) {
      System.out.println("Could not read " + filename);
      System.exit(0);
    }
    return img;
  }

  private static int mapToGray(Color c) {
    int r = c.getRed();
    int g = c.getGreen();
    int b = c.getBlue();
    return (int) (0.299 * r + 0.587 * g + 0.114 * b);
  }

  public static int[][] getImageData(BufferedImage img) {
    int w = img.getWidth();
    int h = img.getHeight();

    int[][] data = new int[h][w];
    for (int i = 0; i < h; i++) {
      for (int j = 0; j < w; j++) {
        Color c = new Color(img.getRGB(j, i));
        int gVal = mapToGray(c);
        data[i][j] = gVal;
      }
    }
    return data;
  }

  public static int[][] getColorImageData(BufferedImage img) {
    int w = img.getWidth();
    int h = img.getHeight();

    int[][] data = new int[h][w];
    for (int i = 0; i < h; i++) {
      for (int j = 0; j < w; j++) {
        data[i][j] = img.getRGB(j, i);
      }
    }
    return data;
  }

  // versucht, ein Bild mit dem Namen "filename" zu lesen
  // welches sich im aktuellen Verzeichnis befinden muss
  // und gibt im Erfolgsfall die Pixeldaten (in Grauwerte ungeformt)
  // als zweidimensionale feld von int Werten zurueck
  public static int[][] getImageDataFromFile(String filename) {
    return getImageData(readImage(filename));
  }

  /* wie die Methode zuvor, liefert aber Farbwerte */
  public static int[][] getColorImageDataFromFile(String filename) {
    return getColorImageData(readImage(filename));
  }

  // generiert ein Grauwert-Bild mit dem Namen "filename"
  // die Pixeldaten werden aus dem als Parameter uebergebenen
  // Feld generiert
  public static void writeImageDataToFile(int[][] data, String filename) {
    writeImage(createImage(data), filename);
  }

  /* wie Methode zuvor, aber als Farbbild */
  public static void writeColorImageDataToFile(int[][] data, String filename) {
    writeImage(createColorImage(data), filename);
  }

  public static void main(String[] args) {
    // Test
    int[][] data = new int[250][250];
    for (int i = 0; i < data.length; i++) {
      for (int j = 0; j < data[i].length; j++) {
        data[i][j] = 255 - i;
      }
    }
    BufferedImage img = createImage(data);
    writeImage(img, "test");
  }
}
