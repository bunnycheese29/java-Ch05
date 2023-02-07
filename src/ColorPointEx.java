public class ColorPointEx {

  public static void main(String[] args) {
    Point point = new Point();
    point.set(10, 10);
    point.showPoint();

    //type casting ColorPoint
    ColorPoint colorPoint = new ColorPoint(20, 20, "blue");
    colorPoint.set(20, 20);
    colorPoint.setColor("red");
    colorPoint.showColorPoint();
  }
}
