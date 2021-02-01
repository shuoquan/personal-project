package exp;

import java.util.Arrays;

public class MyThread extends Thread {
  private static int index = 0;

  private static int ticket = 5;

  private Object obj = new Object();

  public MyThread() {

  }

  public MyThread(String name) {
    super(name);
  }

  public int getTicket() {
    System.out.println(ticket);
    return ticket;
  }

  @Override
  public void run() {
//    for (int i = 0; i < 100; i++) {
////      System.out.println("子线程" + this.getId() + this.getName());
//      System.out.println("子线程" + Thread.currentThread().getName());
//    }

      synchronized (obj) {
        while (ticket > 0) {
          System.out.print(ticket);
          System.out.println("-----" + Thread.currentThread().getId());
          ticket--;
        }
      }
//      try {
//        Thread.sleep(1000);
//      } catch (InterruptedException e) {
//        e.printStackTrace();
//      }

//    for (int i = 1; i < 50; i++) {
//      System.out.println("子线程" + i + Thread.currentThread().getName());
//    }
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

//    MyThread myThread1 = new MyThread();
//    MyThread myThread2 = new MyThread();
//    MyThread myThread3 = new MyThread();
//    MyThread myThread4 = new MyThread();
//    myThread1.start();
//    myThread2.start();
//    myThread3.start();
//    myThread4.start();

//    MyThread myThread = new MyThread();
//    myThread.setDaemon(true);
//    myThread.start();
//    for (int i = 1; i < 500; i++) {
//      System.out.println("主线程" + i + Thread.currentThread().getName());
//    }

//    int ticket = 5;
    Object obj = new Object();
    String[] s = new String[5];
    int[] ticket = {6};
    Runnable runnable = new Runnable() {
      @Override
      public void run() {
        synchronized (obj) {
          while (ticket[0] > 0) {
            System.out.print(ticket[0]);
            System.out.println("-----" + Thread.currentThread().getId());
            ticket[0]--;
          }
        }
      }
    };
    Runnable runnableb = new Runnable() {
      @Override
      public void run() {
        synchronized (obj) {
          while (ticket[0] > 0) {
            System.out.print(ticket[0]);
            System.out.println("-----" + Thread.currentThread().getId());
            ticket[0]--;
          }
        }
      }
    };
//    Thread a = new Thread(runnable);
//    Thread b = new Thread(runnableb);
//    a.start();
//    b.start();
//    System.out.println(b.getState());
//    try {
//      a.join();
//      b.join();
//    } catch (InterruptedException e) {
//      e.printStackTrace();
//    }
//    System.out.println(Arrays.toString(s));

//    MyThread myThread1 = new MyThread();
//    MyThread myThread2 = new MyThread();
//    myThread1.start();
//    myThread2.start();

//    char c = 'C';
//    int b = 12;
//    float x = 12.001f;
//    System.out.println(c+b+x);

    char[] list = new char[5];
    System.out.println(Arrays.toString(list));
  }
}
