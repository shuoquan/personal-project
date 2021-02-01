package exp;

public class KeyBoard implements Usb{

  @Override
  public void service() {
    System.out.println("键盘开始工作");
  }
}
