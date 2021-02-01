package jedis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

public class redis {

  public static void main(String[] args) {
    Jedis jedis = new Jedis("localhost", 6379);
//    System.out.println(jedis.ping());
//    String x = null;
//    System.out.println(x);
    Transaction transaction = jedis.multi();
    try {
      transaction.set("name", "bob");
      transaction.set("age", "12");
      int i = 1/0;
      transaction.exec();
    } catch (Exception e) {
      transaction.discard();
      e.printStackTrace();
    } finally {
      System.out.println(jedis.mget("name", "age"));
      transaction.close();
    }
  }
}
