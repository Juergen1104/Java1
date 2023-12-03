package Semester_3.Aufgabe_11;

import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;

public class ImageLoader {

  public static BufferedImage[] loadImages(String directoryname) {
    BufferedImage[] images = null;
    File dir = new File(directoryname);
    try {
      if (dir.exists() && dir.isDirectory() && dir.canRead()) {
        String[] files = dir.list();
        // for (String f : files){
        //     System.out.println(f);
        // }
        images = new BufferedImage[files.length];
        int z = 0;
        for (String f : files) {
          images[z++] =
              ImageIO.read(new File(directoryname + System.getProperty("file.separator") + f));
        }
      } else {
        System.out.println("Problems with path " + directoryname);
        System.exit(0);
      }
    } catch (IOException | IllegalArgumentException e) {
      e.printStackTrace();
    }
    return images;
  }
}
