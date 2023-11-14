package Semester_3.Schleifen;

public class Schleifen {

  public static void main(String[] args) {
    for (int days = 0; days < 32; days++)
      for (int std = 0; std < 24; std++) {
        for (int min = 0; min < 60; min++) {
          for (int sec = 0; sec < 60; sec++) {

            System.out.println(
                "Tage: " + days + " Stunden: " + std + " Minuten: " + min + " Sekunden : " + sec);
          }
        }
      }
  }
}
