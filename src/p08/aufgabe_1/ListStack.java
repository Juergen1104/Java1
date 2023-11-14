package p08.aufgabe_1;

import p08.data.Element;
import p08.types.List;
import p08.types.Stack;

public class ListStack extends List implements Stack {

  @Override
  public boolean push(Element ele) {

    if (size() < MAX_SIZE) {
      insertElementAt(ele, 0);

      return true;
    } else return false;
  }

  @Override
  public Element pop() {
    if (size() == 0) {
      return null;
    } else {
      return removeElementAt(1);
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

    Element[] elements = new Element[size()];
    for (int i = 0; i < size(); i++) {
      elements[i] = getElementAt(i + 1);
    }
    return elements;
  }
}
