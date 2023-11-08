package Semester_3.Aufgabe_8.aufgabe_1;

import Semester_3.Aufgabe_8.data.Element;
import java.util.Arrays;

public class TestStack {
  public static void main(String[] args) {

    Element[] elements = {
      new StudentElement("Tom", "12131415"),
      new StudentElement("Tom", "11111111"),
      new StudentElement("Anna", "12312300"),
      new StudentElement("Tim", "11336699"),
      new StudentElement("Tobi", "10203040"),
      new StudentElement("Suse", "10000001")
    };

    ListStack listStack = new ListStack();
    ArrayStack arrayStack = new ArrayStack();

    // beide Stacks befüllen

    for (Element element : elements) {
      listStack.push(element);
      arrayStack.push(element);
    }

    int countMember = listStack.size();

    System.out.println("Stack 1:");

    for (int i = 0; i < countMember; i++) {
      Element element = listStack.pop();
      System.out.println(element.toString());
    }
    System.out.println("---------------");

    // ersten Stack nochmals befüllen

    for (Element element : elements) {
      listStack.push(element);
    }

    Element[] elements1 = listStack.toArray();
    Arrays.sort(elements1);

    for (Element element : elements) {
      System.out.println(element.toString());
    }
    System.out.println("---------------");

    System.out.println("Stack 2:");

    for (int i = 0; i < countMember; i++) {
      Element element = arrayStack.pop();
      System.out.println(element.toString());
    }

    // nochmals befuellen

    for (Element element : elements) {
      arrayStack.push(element);
    }

    Element[] elements3 = arrayStack.toArray();
    Arrays.sort(elements3);

    for (Element element : elements3) {
      System.out.println(element.toString());
    }

    System.out.println("---------------");

    System.out.println("---------------");
  }
}
