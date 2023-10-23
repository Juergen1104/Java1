package Semester_1.Aufgabe_1;

public class Aufgabe_1_1 {
  public static void main(String[] args) {
    // Systen.out.println("Übung " + 1 + ':');
    System.out.println(
        "Übung " + 1 + ':'); /* "Systen" statt System.out.println somit falscher Bezeichner*/
    // int a1=1,a2=a1;a3=a1+a2;
    int a1 = 1,
        a2 = a1,
        a3 =
            a1
                + a2; /* "," statt ";" nach der zweiten Zuweisung somit wurde der Befehl frühzeitig beendet*/

    System.out.println(a1);
    System.out.println(a2);
    System.out.println(a3);

    // boolean b = (3 < 2);
    boolean b = (3 < 2);
    // int b1 = (3 < 2);
    /*boolean ist ein logischer Datentyp dessen Literalkonstante nur false und true sein können Änderung auf den integer Datentyp*/
    System.out.println(b);

    // short s1 = 33333;
    int s1 = 33333; /*Der eingegebene Wert 33333 ist zu gross für den Datentyp short
                                                  Durch die Änderung des Datentyps von short auf int liegt der Wert im Literal*/

    System.out.println(s1);

    char c1 = 'ü';

    char c2 = '1';

    String c21 = "1";

    int c3 = c2 + 1;

    /* int c2 = 1, c3 = c2 + 1;                /* Der Datentyp char ist kein numerischer Datentyp. Änderung von char zu int und Entfernung aller Hochkommatas
    Der c3 zugewiesene Ausdruck c2 + 1 ist zum einen kein einzelnes Zeichen, als auch nicht in Hochkommas eingeschlossen (Bezogen auf die Ansprüche des char Datentyps) */

    // float f = 1.0;
    float f = 1.0f; /* Das f nach dem Punkt gehört zu der Gleitkomma-Literalkonstante */
    double f1 = 1.0; /*2. Möglichkeit: Änderung des float Datentyps zu double*/

    // double d = 1E2E;             // das zweite e ist zuviel
    double d = 1E2;
    // float d1 = 1E2;                // Required type: float Provided: double

    // int i = 'uOOOO';                // Too many characters in character literal
    long l = 0xABC; // 0xABC converts to 2748

    // char c = '\';                       //Unclosed character literal
    short s2 = 10, s3 = 3;
    int s4 = (short) s2 % (short) s3; // s4 requires int
    // int bb = (0x1 < 0x2) ? (0xA / 0x5) : 0x; //Hexadecimal numbers must contain at least one
    // hexadecimal digit
  }
}
