package p08.aufgabe_1;

import p08.data.Element;
import p08.types.Stack;

public class ArrayStack implements Stack {

  private Element[] elements = new Element[MAX_SIZE];
  private int lastIndex = 0;

  @Override
  public boolean push(Element ele) {

    if (lastIndex < MAX_SIZE) {
      elements[lastIndex] = ele;
      lastIndex++;
      return true;
    } else return false;
  }

  @Override
  public Element pop() {
    if (lastIndex > 0) {
      lastIndex--;
      return elements[lastIndex];
    } else return null;
  }

  @Override
  public Element peek() {
    if (lastIndex > 0) {
      return elements[lastIndex];
    } else return null;
  }

  @Override
  public Element[] toArray() {

    return elements;
  }

  public int size() {
    return lastIndex;
  }
}
