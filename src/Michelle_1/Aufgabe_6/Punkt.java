package Michelle_1.Aufgabe_6;

// 4
public class Punkt {
  private double x, y;

  /* ***  Aufgabenteil (a)  *** */

  public Punkt(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public Punkt(Punkt punkt) {
    this.x = punkt.x;
    this.y = punkt.y;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public void setX(double x) {
    this.x = x;
  }

  public void setY(double y) {
    this.y = y;
  }

  public void move(double x1, double y1) {

    double x2 = getX() + x1;
    setX(x2);
    double y2 = getY() + y1;
    setY(y2);
  }

  public void scale(double x1, double y1) {

    double x2 = getX() * x1;
    setX(x2);
    double y2 = getY() * y1;
    setY(y2);
  }
}
