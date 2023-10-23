package Semester_1.Aufgabe_3;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.*;

public class Primzahlen {

  public static int prim[];

  static {
    StringBuffer sBuf = new StringBuffer();
    try (BufferedReader bufR =
        new BufferedReader(new FileReader("src/Michelle/Aufgabe_3/primzahlen.txt"))) {
      String line;
      while ((line = bufR.readLine()) != null) {
        sBuf.append(line);
      }
    } catch (IOException e) {
      System.out.println(e);
      System.exit(0);
    }

    Pattern p = Pattern.compile("\\s*[\\d]+,");
    Matcher m = p.matcher(sBuf.toString());
    ArrayList<String> tokens = new ArrayList<>();
    while (m.find()) {
      String s = m.group();
      tokens.add(s.substring(0, s.length() - 1).trim());
    }
    prim = new int[tokens.size()];
    int i = 0;
    for (String s : tokens) {
      prim[i++] = Integer.parseInt(s);
    }
  }
}
