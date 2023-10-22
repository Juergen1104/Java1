package Michelle_1.Aufgabe_8;

public class VerketteteSequenz {

  private class Element {
    public int wert = -1;
    public Element next;
  }

  Element head, z;

  public VerketteteSequenz() {
    head = new Element();
    z = new Element();
    head.next = z;
    z.next = z;
  }

  public VerketteteSequenz(int n) {
    this();
    for (int i = 1; i <= n; i++) {
      Element e_neu = new Element();
      e_neu.wert = (int) (Math.random() * 100) + 1;
      e_neu.next = head.next;
      head.next = e_neu;
    }
  }

  private Element getElementAt(int i) {
    int count = 0;
    Element help = head.next;
    while ((help != z) && (count < i)) {
      help = help.next;
      count++;
    }
    return (help != z) ? help : null;
  }

  public int size() {
    int count = 0;
    Element help = head.next;
    while (help != z) {
      help = help.next;
      count++;
    }
    return count;
  }

  /* *** Aufgabenteil (c) *** */

}
