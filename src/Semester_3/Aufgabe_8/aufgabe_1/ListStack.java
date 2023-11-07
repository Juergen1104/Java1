package Semester_3.Aufgabe_8.aufgabe_1;

import Semester_3.Aufgabe_8.data.Element;
import Semester_3.Aufgabe_8.types.List;
import Semester_3.Aufgabe_8.types.Stack;

public class ListStack extends List implements Stack {

  @Override
  public boolean push(Element ele) {

    if (size() > MAX_SIZE) {
      insertElementAt(ele, 0);
      return true;
    } else return false;
  }

  @Override
  public Element pop() {
    if (size() == 0) {
      return null;
    } else {
      return removeElementAt(0);
    }
  }

  @Override
  public Element peek() {
    if (size() == 0) {
      return null;
    } else {
      return getElementAt(0);
    }
  }

  @Override
  public Element[] toArray() {

    Element[] elements = new Element[size() - 1];
    for (int i = 0; i < size(); i++) {
      elements[i] = getElementAt(i);
    }
    return elements;
  }
}
