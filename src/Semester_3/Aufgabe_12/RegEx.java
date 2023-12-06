package Semester_3.Aufgabe_12;

public class RegEx {

  // Oktalzahl
  // 1
  public static boolean check1(String s) {

    String regex = "[0-7]+";
    return s != null && s.matches(regex);
  }

  // kein Leerzeichen, Tabulator, Zeilenumbruch oder andere Whitespace-Zeichen
  // 1
  public static boolean check2(String s) {

    String regex = "\\S+";
    return s != null && s.matches(regex);
  }

  // nur Buchstaben und Ziffern, aber mindestens ein Gross- und ein
  // Kleinbuchstabe sowie eine Ziffer
  // 1.5
  public static boolean check3(String s) {

    String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]+$";
    return s != null && s.matches(regex);
  }

  // ganze Zahl aus dem Intervall [-100,100]
  // 1.5
  public static boolean check4(String s) {

    String regex1 = "^(0|-?[1-9]\\d?|100)$";
    String regex = "^(-?[1-9]\\d?|100)$";
    return s != null && s.matches(regex);
  }

  // mindestens ein (Groß- oder Klein-)Buchstabe , der mindestens
  // 3x vorkommt (immer als Klein- bzw. als Großbuchstabe)
  // 2
  public static boolean check5(String s) {

    String regex = ".*([a-zA-Z])\\1\\1.*";
    return s != null && s.matches(regex);
  }

  // genau vier Ziffern, dabei zwei verschiedene Ziffern,
  // die jeweils 2x auftreten
  // 2
  public static boolean check6(String s) {

    String regex = "^(\\d)\\1(?!\\1)(\\d)\\2$";
    return s != null && s.matches(regex);
  }

  public static void main(String[] args) {
    System.out.println("Test 1:");
    System.out.println("Die Zeichenkette repräsentiert eine Oktalzahl in\n" + "Java-Notation");
    String[] str1 = {"01", "020", "0", "00", "100", "088", "019"};
    for (String s : str1) {
      System.out.println("\"" + s + "\"" + " -> " + check1(s));
    }

    System.out.println("\nTest 2:");
    System.out.println("Die Zeichenkette enthält keine Whitespace-Zeichen.");
    String[] str2 = {"abababa", "ab ab", " ab", "ab\tab", "ab\n"};
    for (String s : str2) {
      System.out.println("\"" + s + "\"" + " -> " + check2(s));
    }

    System.out.println("\nTest 3:");
    System.out.println(
        "Die Zeichenkette besteht ausschließlich aus Buchstaben\n"
            + "und Ziffern, enthält dabei aber je mindestens einen\n"
            + "Kleinbuchstaben, Großbuchstaben sowie eine Ziffer");
    String[] str3 = {"aB33", "1234Xy", "0XxxxX0", "a999z", "AB33"};
    for (String s : str3) {
      System.out.println("\"" + s + "\"" + " -> " + check3(s));
    }

    System.out.println("\nTest 4:");
    System.out.println(
        "Die Zeichenkette repräsentiert eine ganze Zahl aus\n" + "dem Intervall [-100,100]");
    String[] str4 = {"-100", "-99", "42", "+12", "0", "09", "101"};
    for (String s : str4) {
      System.out.println("\"" + s + "\"" + " -> " + check4(s));
    }

    System.out.println("\nTest 5:");
    System.out.println(
        "Die Zeichenkette enthält mindestens einen Buchstaben\n"
            + "genau dreimal (Klein- und Großbuchstaben werden\n"
            + "dabei als unterschiedliche Zeichen gewertet).");
    String[] str5 = {"axbcxdexfgh", "aabbcca", "hiiih", "zzz", "PspSPs"};
    for (String s : str5) {
      System.out.println("\"" + s + "\"" + " -> " + check5(s));
    }

    System.out.println("\nTest 6:");
    System.out.println(
        "Die Zeichenkette besteht aus genau vier Ziffern.\n"
            + "Dabei wird die Zeichenkette aus zwei verschiedenen\n"
            + "Ziffern gebildet, die jeweils zweimal vorkommen.");
    String[] str6 = {"1212", "5566", "7447", "9999", "313", "1747"};
    for (String s : str6) {
      System.out.println("\"" + s + "\"" + " -> " + check6(s));
    }
  }
}
