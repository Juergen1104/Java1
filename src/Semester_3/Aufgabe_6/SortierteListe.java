package Semester_3.Aufgabe_6;

public class SortierteListe extends Liste {

  // Fügen Sie den Teilnehmer so ein, dass die Liste sortiert bleibt
  @Override
  public void insert(Teilnehmer teilnehmer) {

    Listenelement neuesElement = new Listenelement();
    neuesElement.data = teilnehmer;
    neuesElement.next = null;

    if ((head.next.data == null) || (head.next.data.compareTo(teilnehmer) == -1)) {
      super.insert(teilnehmer);
    } else {

      Listenelement current = new Listenelement();
      current = head;

      while (current.next.data != null && teilnehmer.compareTo(current.next.data) < 0) {

        current = current.next;
      }
      neuesElement.next = current.next;
      current.next = neuesElement;
    }
  }
}
