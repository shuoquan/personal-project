package exp;

/*
* 鼠标，子类产品
* */
public class Mouse implements Usb{

  @Override
  public void service() {
    System.out.println("鼠标工作");
  }
}
