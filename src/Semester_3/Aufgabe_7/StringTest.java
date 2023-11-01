package Semester_3.Aufgabe_7;

public class StringTest {

  /* *** Aufgabe 1a *** */
  // 2

  public static String filterLetters(String s) {

    StringBuffer stringBuffer = new StringBuffer(s.length());
    int pos = 0;
    for (int i = s.length() - 1; i > -1; i--) {

      char c = s.charAt(i);
      if (!Character.isLetter(c)) {
        continue; // next character
      }
      stringBuffer.insert(pos, (Character.toLowerCase(c)));
      pos++;
    }
    return stringBuffer.toString();
  }

  /* *** Aufgabe 1b *** */
  // 2.5
  public static boolean isPalindromeIt(String s) {

    int i = 0;
    int j = s.length() - 1;
    while (i < j) {
      if (s.charAt(i) != s.charAt(j)) {
        return false;
      }
      i++;
      j--;
    }
    return true;
  }

  /* *** Aufgabe 1c *** */
  // 2.5
  public static boolean isPalindromeRek(String s) {

    if (s.length() <= 1) {
      return true;
    }

    if (s.charAt(0) == s.charAt(s.length() - 1)) {
      String innerStr = s.substring(1, s.length() - 1);
      return isPalindromeRek(innerStr);
    }
    return false;
  }

  public static void main(String[] args) {

    String[] pBeispiele = {
      "Erika feuert nur untreue Fakire.",
      "Ein Esel lese nie.",
      "Lag er im Kajak, mir egal.",
      "Trug Tim eine so helle Hose nie mit Gurt?",
      "Vitaler Nebel mit Sinn ist im Leben relativ!",
      "Der Freibierfred",
      "Genie, der Herr ehre Dein Ego!",
      "abcdecba"
    };

    for (String s : pBeispiele) {
      String t = filterLetters(s);
      if (isPalindromeIt(t)) {
        System.out.println("Iterativ: " + s);
      }
      if (isPalindromeRek(t)) {
        System.out.println("Rekursiv: " + s);
      }
    }
  }
}
