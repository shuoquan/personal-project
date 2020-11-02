package exp;

public class MyThread extends Thread {

  private int ticket = 100;

  public MyThread() {

  }

  public MyThread(String name) {
    super(name);
  }

  @Override
  public void run() {
//    for (int i = 0; i < 100; i++) {
////      System.out.println("子线程" + this.getId() + this.getName());
//      System.out.println("子线程" + Thread.currentThread().getName());
//    }
    while (ticket > 0) {
      ticket--;
      System.out.print(ticket);
      System.out.println("-----" + Thread.currentThread().getId());
//      try {
//        Thread.sleep(1000);
//      } catch (InterruptedException e) {
//        e.printStackTrace();
//      }
    }
  }

  public static void main(String[] args) {
//    MyThread myThread = new MyThread("kaka");
//    MyThread myThread1 = new MyThread();
//    // 启动线程
//    myThread1.setName("peqi");
//    myThread.start();
//    myThread1.start();
//    for (int i = 0; i < 100; i++) {
//      System.out.println("主线程");
//    }

    MyThread myThread1 = new MyThread();
    MyThread myThread2 = new MyThread();
    MyThread myThread3 = new MyThread();
    MyThread myThread4 = new MyThread();
    myThread1.start();
    myThread2.start();
    myThread3.start();
    myThread4.start();
  }
}
