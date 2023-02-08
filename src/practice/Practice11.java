package practice;

import java.util.Scanner;

abstract class Calc {

  protected int a;
  protected int b;

  void setValue(int a, int b) {
    this.a = a;
    this.b = b;
  }

  //피연산자 값을 객체 내에 저장
  abstract int calculate();
}

class Add extends Calc {

  public Add() {}

  int calculate() {
    return a + b;
  }
}

class Sub extends Calc {

  public Sub() {}

  int calculate() {
    return a - b;
  }
}

class Mul extends Calc {

  public Mul() {}

  int calculate() {
    return a * b;
  }
}

class Div extends Calc {

  public Div() {}

  int calculate() {
    return a / b;
  }
}

public class Practice11 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("두 정수와 연산자를 입력하시오>>");
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    String c = scanner.next();

    if (c.equals("+")) {
      Add add = new Add();
      add.setValue(a, b);
      System.out.println(add.calculate());
    } else if (c.equals("-")) {
      Sub sub = new Sub();
      sub.setValue(a, b);
      System.out.println(sub.calculate());
    } else if (c.equals("*")) {
      Mul mul = new Mul();
      mul.setValue(a, b);
      System.out.println(mul.calculate());
    } else if (c.equals("/")) {
      Div div = new Div();
      div.setValue(a, b);
      System.out.println(div.calculate());
    }
  }
}
