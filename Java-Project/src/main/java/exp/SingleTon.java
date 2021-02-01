package exp;

public class SingleTon {

  private static final SingleTon instance = new SingleTon();

  private SingleTon() {
  }

  public static SingleTon getInstance() {
    return instance;
  }

  public static void main(String[] args) {
//    for (int i = 0; i < 10; i++) {
//      new Thread(new Runnable() {
//        @Override
//        public void run() {
//          System.out.println(Thread.currentThread().getName() + SingleTon.getInstance().hashCode());
//        }
//      }).start();
//    }
    Gender gender = Gender.FEMALE;
  }
}
