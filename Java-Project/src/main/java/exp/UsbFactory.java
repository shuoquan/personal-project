package exp;

import java.util.Scanner;
import java.util.function.Consumer;

public class UsbFactory {

  public static Usb create(String type)
      throws ClassNotFoundException, IllegalAccessException, InstantiationException {
    Usb usb = null;
    Class usbClass = Class.forName(type);
    usb = (Usb) usbClass.newInstance();
    return usb;
  }

  public static void main(String[] args)
      throws IllegalAccessException, InstantiationException, ClassNotFoundException {
//    Scanner input = new Scanner(System.in);
//    int type = input.nextInt();
//    if (type == 1) {
//      Usb usb = UsbFactory.create("exp.Mouse");
//      usb.service();
//    } else if (type == 2) {
//      Usb usb = UsbFactory.create("exp.KeyBoard");
//      usb.service();
//    }
//    usb.service();

    Usb mouse = new Usb() {
      @Override
      public void service() {
        System.out.println("hello mouse");
      }
    };
    mouse.service();

    Usb keyboard = ()->{
      System.out.println("hello keyboard");
    };
    keyboard.service();


  }
}
