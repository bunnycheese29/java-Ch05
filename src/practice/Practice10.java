package practice;

abstract class Pairmap {

  protected String keyArray[];
  protected String valueArray[];

  abstract String get(String key); //key값을 가진 value리턴, 없으면 null

  abstract void put(String key, String value); //key와 value를 쌍으로 저장

  abstract String delete(String key); //key값을 가진 아이템 삭제, 삭제된 value값 리턴

  abstract int length();
}

class Dictionary extends Pairmap {

  private int size;
  private int count;

  public Dictionary(int size) {
    this.size = size;
    keyArray = new String[size];
    valueArray = new String[size];
  }

  String get(String key) {
    for (int i = 0; i < count; i++) {
      if (keyArray[i].equals(key)) {
        return valueArray[i];
      }
    }
    return null;
  }

  void put(String key, String value) {
    int index = count;
    for (int i = 0; i < count; i++) {
      if (key.equals(keyArray[i])) {
        index = i;
        break;
      }
    }
    keyArray[index] = key;
    valueArray[index] = value;
    count++;
  }

  String delete(String key) {
    String temp = get(key);
    int index = count;
    for (int i = 0; i < count; i++) {
      if (key.equals(keyArray[i])) {
        index = i;
        break;
      }
    }
    keyArray[index] = "";
    valueArray[index] = "";
    count--;
    return temp;
  }

  int length() {
    return count;
  }
}

public class Practice10 {

  public static void main(String[] args) {
    Dictionary dic = new Dictionary(10);
    dic.put("황기태", "자바");
    dic.put("이재문", "파이선");
    dic.put("이재문", "C++");
    System.out.println("이재문의 값은 " + dic.get("이재문"));
    System.out.println("황기태의 값은 " + dic.get("황기태"));
    dic.delete("황기태");
    System.out.println("황기태의 값은 " + dic.get("황기태"));
  }
}
