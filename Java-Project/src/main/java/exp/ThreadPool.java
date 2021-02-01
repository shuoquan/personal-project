package exp;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class ThreadPool {

  public static void main(String[] args) {
//    ExecutorService executorService = Executors.newFixedThreadPool(4);
//    ExecutorService executorService = Executors.newCachedThreadPool();
//    Runnable runnable = new Runnable() {
//      private int ticket = 10;
//
//      @Override
//      public void run() {
//        while (ticket > 0) {
//          System.out.println(Thread.currentThread().getName());
//          System.out.println(ticket);
//          ticket--;
//        }
//      }
//    };
//    executorService.submit(runnable);
//    executorService.submit(runnable);
//    executorService.submit(runnable);
//    executorService.submit(runnable);
//    executorService.shutdown();

    Callable<Integer> callable = new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
          System.out.println(i + Thread.currentThread().getId());
          sum += i;
        }
        return sum;
      }
    };
    // callable转化成可执行任务
    FutureTask<Integer> futureTask = new FutureTask<>(callable);
    Thread thread = new Thread(futureTask);
    thread.start();
  }
}
