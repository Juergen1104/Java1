package Semester_3.Aufgabe_5;

class FlussListenelement {
  Fluss data;
  FlussListenelement next;
}

public class FlussListe {
  FlussListenelement head;
  FlussListenelement z;

  // leere Liste erzeugen
  public FlussListe() {
    head = new FlussListenelement();
    z = new FlussListenelement();
    head.data = null;
    head.next = z;
    z.data = null;
    z.next = z;
  }

  // Ausgabe aller Elemente der Liste
  public void printListe() {
    int count = 1;
    FlussListenelement ele = head.next;
    while (ele != z) {
      System.out.println(count++ + ". " + ele.data);
      ele = ele.next;
    }
    System.out.println();
  }

  // neues Element mit dem als Parameter übergebenen Daten-Objekt
  // am Kopf der Liste einfügen
  public void insert(Fluss fluss) {
    FlussListenelement newEle = new FlussListenelement();
    newEle.data = fluss; // nur Referenzkopie
    newEle.next = head.next;
    head.next = newEle;
  }

  // Aufgabe 3a *** */
  // filtert alle Fluesse mit einer bestimmten Muendung aus
  // der Liste und speichert sie in einer Ergebnisliste,
  // die am Ende zurueckgegeben wird
  // Hinweis: Vergleichen Sie zwei String-Werte s1 und s2 auf
  //          Gleichheit mit der Instanzmethode equals:
  //          s1.equals(s2)

  public FlussListe filterNachMuendung(String muendung) {
    FlussListe filteredList = new FlussListe();
    FlussListenelement current = head.next;
    while (current.data != null) {
      Fluss currentFluss = current.data;
      if (currentFluss.muendung.equals("Mittelmeer")) {
        int x = 0;
      }

      if (currentFluss.muendung.equals(muendung)) {
        filteredList.insert(currentFluss);
      }
      current = current.next;
    }

    return filteredList;
  }

  /* *** Aufgabe 3d *** */

  // Die Methode generiert eine StringListe, die alle
  // Muendungen beinhaltet, die in einem der Fluesse
  // der aktuellen Flussliste vorkommen
  // 2P
  public StringListe getMuendungen() {
    StringListe mListe = new StringListe();
    FlussListenelement current = head.next;
    while (current.data != null) {
      Fluss currentFluss = current.data;
      mListe.insertNoDuplicates(currentFluss.muendung);
      current = current.next;
    }
    return mListe;
  }
}
