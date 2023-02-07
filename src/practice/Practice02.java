package practice;

class TV {

  private int size;

  public TV(int size) {
    this.size = size;
  }

  protected int getSize() {
    return size;
  }
}

class ColorTV extends TV {

  private int color;

  public ColorTV(int size, int color) {
    super(size);
    this.color = color;
  }

  public void printProperty() {
    System.out.println(getSize() + "인치 " + color + "색 컬러");
  }
}

class IPTV extends ColorTV {

  private String ip;

  public IPTV(int size, int color, String ip) {
    super(size, color);
    this.ip = ip;
  }

  public void printProperty() {
    System.out.print("나의 IPTV는 " + ip + " 주소의 ");
    super.printProperty();
  }
}

public class Practice02 {

  public static void main(String[] args) {
    IPTV iptv = new IPTV(32, 2048, "192.1.1.2");
    iptv.printProperty();
  }
}
