package Semester_3.Aufgabe_7;

public class Alphabet {

  public static String[][] map = {
    {"C", "K"},
    {"c", "k"},
    {"J", "I"},
    {"j", "i"},
    {"Qu", "Kw"},
    {"qu", "kw"},
    {"V", "F"},
    {"v", "f"},
    {"X", "Ks"},
    {"x", "ks"},
    {"Y", "i"},
    {"y", "i"},
    {"Z", "Ts"},
    {"z", "ts"},
    {"ß", "ss"},
    {"Ä", "ä"},
    {"ä", "e"}
  };

  // 2
  public static String mapText(String text) {

    StringBuilder result = new StringBuilder();

    for (int i = 0; i < text.length(); i++) {
      char currentChar = text.charAt(i);
      boolean isReplaced = false;

      for (String[] mapping : map) {

        if (mapping[0].length() == 1) {
          // 2-stellige Werte werden ignoriert. Keine Idee wie das besser geht

          if (mapping[0].contains(String.valueOf(currentChar))) {
            result.append(mapping[1]);
            isReplaced = true;
            break;
          }
        }
      }

      if (!isReplaced) {
        result.append(currentChar);
      }
    }

    return result.toString();
  }

  public static void main(String[] args) {
    String test =
        "Eine Kürzung des Alphabets um dreißig Prozent "
            + "hat zahlreiche Vorteile.\nKinder lernen das Alphabet in "
            + "Rekordzeit, Computertastaturen werden \nschlanker und die "
            + "Rechtschreibung wird logisch nachvollziehbarer.";

    System.out.println(test);
    System.out.println("->");
    System.out.println(mapText(test));
  }
}
