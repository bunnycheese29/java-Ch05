package practice;

import java.util.Scanner;

public class Practice09 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("총 스택 저장 공간의 크기 입력 >> ");
    int total = scanner.nextInt();
    StringStack ss = new StringStack(total);
    while (true) {
      System.out.print("문자열 입력 >>");
      String str = scanner.next();
      if (str.equals("그만")) {
        break;
      }
      boolean response = ss.push(str);
      if (response == false) {
        System.out.println("스택이 꽉차서 푸시 불가!");
      }
    }
    System.out.println("저장 공간 : " + ss.capacity());
    System.out.println("저장 된 글자 수 : " + ss.length());
    int total02 = ss.length();
    for (int i = 0; i < total02; i++) {
      System.out.print(ss.length() + " ");
      System.out.print(ss.pop());
    }
  }
}
