package Semester_3.Aufgabe_8.aufgabe_1;

import Semester_3.Aufgabe_8.data.Element;

public class StudentElement extends Element {
  private String name;
  private String matriculationNumber;

  public StudentElement(String name, String matriculationNumber) {
    this.name = name;
    this.matriculationNumber = matriculationNumber;
  }

  public String toString() {
    return this.name + " (" + matriculationNumber + ")";
  }

  public boolean equals(Object o) {
    return this.matriculationNumber.equals(((StudentElement) o).matriculationNumber);
  }

  public int compareTo(Element e2) {

    if (!(e2 instanceof Element)) {
      throw new RuntimeException("Parameter is not of type StudentElement");
    } else {
      return 0;
    }
  }

  @Override
  public int compareTo(Object o) {
    return 0;
  }
}
