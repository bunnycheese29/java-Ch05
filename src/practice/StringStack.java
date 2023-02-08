package practice;

public class StringStack implements Stack {

  private String element[];
  private int end;

  public StringStack(int capacity) {
    element = new String[capacity]; //배열 초기화
    end = -1;
  }

  //현재 스택에 저장된 개수 리턴
  public int length() {
    return end + 1;
  }

  //스택의 전체 저장 가능한 개수 리턴
  public int capacity() {
    return element.length;
  }

  //스택의 top에 실수 저장
  public String pop() {
    if (end == -1) {
      return null;
    } else {
      String popStr = element[end];
      end--;
      return popStr;
    }
  }

  //스택의 톱(top)에 저장된 실수 리턴
  public boolean push(String val) {
    if (end == element.length - 1) {
      return false;
    } else {
      end++;
      element[end] = val;
      return true;
    }
  }
}
