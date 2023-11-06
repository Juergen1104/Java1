package Semester_3.Aufgabe_8.data;

public abstract class Element implements Comparable {

  private int counter = 0;
  protected int id;

  public Element() {
    id = ++counter;
  }

  public String toString() {
    return "Element " + id + ":";
  }
}
