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

      StudentElement studentElement = StudentElement.class.cast(e2);

      return toString().compareTo(e2.toString());

      //      if ((studentElement.name.compareTo(name) == 0)
      //          && (studentElement.matriculationNumber == matriculationNumber)) {
      //        return 0;
      //      }
      //      ;
      //      return 1;
    }
  }

  @Override
  public int compareTo(Object o) {
    return 0;
  }
}
