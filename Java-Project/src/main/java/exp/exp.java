package exp;

import static java.lang.Character.getType;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
//import sun.plugin2.message.Message;
//import sun.plugin2.message.Serializer;

import java.io.IOException;
import java.io.StringReader;
import java.util.*;
import java.util.Map.Entry;

public class exp implements Runnable {

  //   private int first;
//   private int second;
  private int age;

  exp(int age) {
    this.age = age;
  }

  @Override
  public void run() {
//
  }

  public static void main(String[] args) {
//      Stack stack = new Stack();
//      stack.push(null);
//      System.out.println(stack.pop());
//      System.out.println(stack);
//       Queue queue = new LinkedList();
//       queue.offer("123");
//       queue.offer("234");
//       System.out.println(queue.remove("123"));
//       System.out.println(queue);;
//      exp e = new exp(12);
//      e.age = 2;
//      System.out.println(e.age);

//        Collection collection = new ArrayList();
//        collection.add(12);
//        collection.add("bob");
//        System.out.println(collection.size());
//        System.out.println(collection.remove(12));
//        System.out.println(collection);
//        for(Object object: collection) {
//          System.out.println(object);
//        }
//        Iterator it = collection.iterator();
//        while(it.hasNext()){
//          System.out.println(it.next());
//        }
//        System.out.println(collection);

    Student student = new Student("bob", 12);
    System.out.println(student.getName());
    List list = new ArrayList();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(2, 4);
//          list.remove();
    System.out.println(list);
    Iterator it = list.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }

    ListIterator listIterator = list.listIterator();
    while (listIterator.hasNext()) {
      System.out.println(listIterator.nextIndex());
      listIterator.next();
//            System.out.println(listIterator.next());
    }
    while (listIterator.hasPrevious()) {
      System.out.println(listIterator.previousIndex());
      listIterator.previous();
    }
//          System.out.println(list.indexOf(2));
//    System.out.println(list);
//    list.remove((Object) 1);
//    System.out.println(list);
    System.out.println(list);
    System.out.println(list.subList(1, 3));
    System.out.println(list);

    ArrayList arrayList = new ArrayList();
    arrayList.add(new Student("bob", 12));
    arrayList.add(new Student("alice", 13));
    arrayList.add(new Student("david", 14));
    arrayList.add(new Student("java", 15));
    for (Object object : arrayList) {
      System.out.println(object);
    }
//    arrayList.remove(1);
    Iterator arrayIt = arrayList.iterator();
    while (arrayIt.hasNext()) {
      System.out.println(arrayIt.next());
    }
    Integer a = new Integer(2);
    System.out.println(arrayList.indexOf(new Student("bob", 12)));

    JSONObject json = new JSONObject();
    json.put("name", "bob");
    System.out.println(json.put("name", 12));
    System.out.println(json);

    StringBuffer buffer = new StringBuffer();
    buffer.append("123");
    buffer.replace(1, 4, "2223");
    System.out.println(buffer);

//    Thread thread = new Thread();
//    thread.start();
//    System.out.println(thread.getId());
//    System.out.println(thread.getStackTrace());
    ArrayList test = new ArrayList();
    System.out.println(test.size());
    System.out.println(15 >> 1);

    System.out.println("+" == "+");
    System.out.println(0 % 12);

    Vector v = new Vector();
    v.add(2);
//    System.out.println(v.addAll(v));
//    System.out.println(v);
    // vector 特有enumeration枚举器
    Enumeration enumeration = v.elements();
//    while(enumeration.hasMoreElements()){
//      System.out.println(enumeration.nextElement());
//    }
//    System.out.println(v.firstElement());
//    System.out.println(v.elementAt(0));

    // LinkedList 双向链表
    LinkedList linkedList = new LinkedList();
    linkedList.add(1);
    linkedList.add(2);
    linkedList.add(3);
    System.out.println(linkedList.getLast());

//    ArrayList<Integer> timeList = new ArrayList<>();
//    Integer start = 0;
//    while (start < 100000000) {
//      timeList.add(start);
//      start += 1;
//    }
//    System.out.println(timeList.size());
//    long lastTime = new Date().getTime();
//    System.out.println(lastTime);

    Set<Integer> set = new HashSet<>();
    set.add(1);
    System.out.println("ff");

    HashSet<String> hashSet = new HashSet<>();
    hashSet.add("bob");
    hashSet.add("alice");
    hashSet.add("georage");
    System.out.println(hashSet);

//    int[] coins = {1,2,3};
//    System.out.println(10/3+1);
////    for(Integer coin : coins){
////      System.out.println(coin);
////    }
//
//    long start = new Date().getTime();
//    long begin = 1000000000;
////    while(begin>0){
////      begin-=1;
////    }
//    for(int i=0; i<1000000000;i++){
//
//    }
//    long end = new Date().getTime();
//    System.out.println((end-start));

    TreeSet<Integer> treeSet = new TreeSet<>();
    treeSet.add(3);
    treeSet.add(2);
    treeSet.add(4);
    treeSet.add(1);
    treeSet.add(5);
    System.out.println(treeSet);
    System.out.println(treeSet.contains(5));
    System.out.println("123".compareTo("1234"));

    Map<String, String> map = new HashMap<>();
    map.put("name", "bob");
    map.put("age", "12");
    System.out.println(map.keySet());
    System.out.println(map.entrySet());
    for(Entry<String, String> entry : map.entrySet()){
      System.out.println(entry.getKey());
    }
    System.out.println(map.containsValue("name"));

    Student s1 = new Student("bob", 12);
    Student s2 = s1;
    s1.setName("alice");
    System.out.println(s1.getName());
    System.out.println(s2.getName());
    System.out.println();
  }
}
