package chapter8.abstractt;

public abstract class Figure {
    double dim1;
    double dim2;
    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }
    abstract double area();
}
  class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }
      @Override
      double area() {
          System.out.println("B области четырехугольника.");
          return dim1 * dim2;
      }
  }
  class Tringle extends Figure {
    int as;
    int df;
    Tringle(double a, double b) {
        super(a, b);
    }

      @Override
      double area() {
          System.out.println("B области треугольника.");
          return dim1 * dim2 / 2;
      }
  }
  class AbstractAreas{
      public static void main(String[] args) {
          Figure figref;
          Rectangle r = new Rectangle(10, 10);
          Tringle t = new Tringle(9,5);
          figref = r;
          System.out.println("Плoщaдь равна " + figref.area());
          figref = t;
          System.out.println("Плoщaдь равна " + figref.area());
      }
  }
