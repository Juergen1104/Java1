package Semester_3.Aufgabe_8.types;

import Semester_3.Aufgabe_8.data.Element;

public interface Stack {
  int MAX_SIZE = 6; // maximale Anzahl von Elementen auf dem Stack

  boolean push(Element ele);

  Element pop();

  Element peek();

  Element[] toArray();
}
