class Shape {

  public void draw() {
    System.out.println("Shape");
  }
}

class Line extends Shape {

  //부모랑 똑같은 메서드를 재정의를 한다 = 오버라이딩
  public void draw() {
    System.out.println("Line");
  }
}

public class MethodOverride {

  public static void main(String[] args) {
    Shape shape = new Shape();
    shape.draw();
    Line line = new Line();
    line.draw();
  }
}
