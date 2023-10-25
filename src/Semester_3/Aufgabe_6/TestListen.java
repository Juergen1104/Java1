package Semester_3.Aufgabe_6;

public class TestListen {
  public static void main(String[] args) {
    Teilnehmer[] teilnehmer = TestData.getTeilnehmerFeld();

    /* *** Aufgabe 2c *** */

    Liste liste[] = new Liste[3];
    liste[0] = new Liste();
    liste[1] = new SortierteListe();
    liste[2] = new ListenFeld();

    for (Teilnehmer ele : teilnehmer) {
      liste[0].insert(ele);
      liste[1].insert(ele);
      liste[2].insert(ele);
    }

    liste[0].print();
    System.out.println("------------------");
    liste[1].print();
    liste[2].print();
  }
}
