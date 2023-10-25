package Semester_3.Aufgabe_6;

public class ListenFeld extends SortierteListe {
  private static final int N = 5;
  Liste[] liste = new Liste[N];

  public ListenFeld() {
    for (int i = 0; i < N; i++) {
      liste[i] = new SortierteListe();
    }
  }

  @Override
  public void print() {

    for (Liste liste : liste) {
      liste.print();
      System.out.println(" ");
    }
  }

  @Override
  public void insert(Teilnehmer teilnehmer) {
    // (Jahrgang -2010) / 2
    int index = (teilnehmer.getKey() - 2010) / 2;
    liste[index].insert(teilnehmer);
  }
}
