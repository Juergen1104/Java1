package Semester_1.Aufgabe_7;

public class RegEx {

  // durch 5 teilbare Zahl
  // 1
  public static boolean check1(String s) {

    if (s.matches("\\d*5$") || s.matches("\\d*0$")) {
      return true;
    }
    return false;
  }

  // Hexadezimalzahl
  // 1
  public static boolean check2(String s) {

    if (s.matches("0[xX][0-9a-fA-F]+")) {
      return true;
    }
    return false;
  }

  // genau 4 Ziffern, aber nicht 1234
  // 1.5
  public static boolean check3(String s) {

    if (s.matches("(\\d{4})")) {
      return true;
    }
    return false;
  }

  // beliebig lange Zeichenkette, die kein Whitespace Zeichen enthalten
  // und mindestens einen Grossbuchstaben (der kein Umlaut ist) und mindestens eine Ziffer
  // 1.5
  public static boolean check4(String s) {
    return false;
  }

  // genau 3 Ziffern, die aber nicht alle identisch sein dürfen
  // 2
  public static boolean check5(String s) {
    return false;
  }

  // genau 3 Ziffern, die aber alle verschieden sein müssen
  // 2*
  public static boolean check6(String s) {
    return false;
  }

  /*

  */

  public static void main(String[] args) {
    //        System.out.println("Test 1:");
    //        System.out.println("Die Zeichenkette repraesentiert eine positive Zahl, die ohne Rest
    // durch 5 teilbar ist.");
    //        String[] str1 = {"20","25", "000","001","5123456789"};
    //        for (String s : str1){
    //            System.out.println("\"" + s + "\"" + " -> " + check1(s));
    //        }
    //
    //        System.out.println("\nTest 2:");
    //        System.out.println("Die Zeichenkette stellt eine Hexadezimalzahl dar ");
    //        String[] str2 = {"0xa","0XfF","0x1","0x", "0X A"};
    //        for (String s : str2){
    //            System.out.println("\"" + s + "\"" + " -> " + check2(s));
    //        }

    System.out.println("\nTest 3:");
    System.out.println(
        "Die Zeichenkette repraesentiert eine vierstellige positive ganze Zahl, aber nicht 1234");
    String[] str3 = {"1233", "1111", "00000", "123", "1234"};
    for (String s : str3) {
      System.out.println("\"" + s + "\"" + " -> " + check3(s));
    }

    //        System.out.println("\nTest 4:");
    //        System.out.println("Die Zeichenkette stellt eine beliebig lange Zeichenkette ohne
    // Whitespace Zeichen, aber mit mindestens einem Großbuchstaben und einer Ziffer dar");
    //        String[] str4 = {"Abcde1","1a2B3c","000OOO"," 000OOO","1a2b3c","abcdeF"};
    //        for (String s : str4){
    //            System.out.println("\"" + s + "\"" + " -> " + check4(s));
    //        }
    //
    //        System.out.println("\nTest 5:");
    //        System.out.println("Die Zeichenkette besteht aus genau drei Ziffern, die aber nicht
    // alle gleich sein duerfen");
    //        String[] str5 = {"123","747","255","1234","999"};
    //        for (String s : str5){
    //            System.out.println("\"" + s + "\"" + " -> " + check5(s));
    //        }
    //
    //
    //        System.out.println("\nTest 6:");
    //        System.out.println("Die Zeichenkette besteht aus genau drei unterschiedlichen
    // Ziffern");
    //        String[] str6 = {"123","951","121","355","110"};
    //        for (String s : str6){
    //            System.out.println("\"" + s + "\"" + " -> " + check6(s));
    //        }
  }
}
