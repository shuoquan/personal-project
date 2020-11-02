package exp;

public class RunableThread implements Runnable {

  @Override
  public void run() {
    for (int i = 0; i < 100; i++) {
      System.out.println(i + "----" + Thread.currentThread().getId());
    }
  }

  public static void main(String[] args) {
    RunableThread runableThread = new RunableThread();
    Thread thread = new Thread(runableThread);
    Thread thread1 = new Thread(runableThread);
    thread.start();
    thread1.start();
//    Runnable runnable = new Runnable() {
//      @Override
//      public void run() {
//        for (int i = 0; i < 100; i++) {
//          System.out.println(i + "----" + Thread.currentThread().getId());
//        }
//      }
//    };
//    Thread thread2 = new Thread(runnable);
//    thread2.start();
  }
}
