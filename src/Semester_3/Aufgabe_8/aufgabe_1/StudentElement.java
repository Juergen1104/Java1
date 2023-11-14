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

  @Override
  public int compareTo(Object o) {

    if (!(o instanceof Element)) {
      throw new RuntimeException("Parameter is not of type StudentElement");
    } else {

      StudentElement studentElement = StudentElement.class.cast(o);
      return toString().compareTo(o.toString());
    }
  }
}
