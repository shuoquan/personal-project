package exp;

import static java.lang.Character.getType;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
//import sun.plugin2.message.Message;
//import sun.plugin2.message.Serializer;

import com.alibaba.fastjson.parser.Feature;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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

  public static void main(String[] args)
      throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException, ExecutionException, InterruptedException {
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
    for (Entry<String, String> entry : map.entrySet()) {
      System.out.println(entry.getKey());
    }
    System.out.println(map.containsValue("name"));

    Student s1 = new Student("bob", 12);
    Student s2 = s1;
    s1.setName("alice");
    System.out.println(s1.getName());
    System.out.println(s2.getName());
    System.out.println();

    Student s = new Student("张三", 12);
    System.out.println(s.getClass());
    System.out.println(Student.class);
    // 第三种通用性更强
    System.out.println(Class.forName("exp.Student"));
    System.out.println(Arrays.toString(Class.forName("exp.Student").getInterfaces()));

    Class studentClass = Class.forName("exp.Student");
    // 获取类中构造函数列表
    System.out.println(Arrays.toString(studentClass.getConstructors()));
    // 获取类中无参构造函数
    Constructor constructor = studentClass.getConstructor();
    Object ss = studentClass.newInstance();
    System.out.println(ss.toString());

    // 获取带参构造
    Constructor paramConstructor = studentClass.getConstructor(String.class, int.class);
    System.out.println(paramConstructor.newInstance("12", 12).toString());

    // 获取类方法
    // getMethods只能获取公有方法或者从父类继承的方法
    Method[] methods = studentClass.getMethods();
    System.out.println(Arrays.toString(methods));
    // getDeclaredMethods获取类中所有方法但不包括父类继承的方法
    methods = studentClass.getDeclaredMethods();
    System.out.println(Arrays.toString(methods));
    // 获取单个方法
    Method method = studentClass.getMethod("eat");
    method.invoke(ss);
    // 获取带参公有方法
    method = studentClass.getMethod("eat", String.class);
    System.out.println(method.invoke(ss, "hah"));

    // 获取带参私有方法
    method = studentClass.getDeclaredMethod("drink", String.class);
    // 设置访问权限无效
    method.setAccessible(true);
    System.out.println(method.invoke(ss, "hah"));

    // 获取静态方法
//    studentClass.getMethod("beat", String.class);
//    System.out.println(method.invoke(null, "hah"));

    // lambda表达式
    TreeSet<String> treeSet1 = new TreeSet<>((String str1, String str2) -> {
      return str1.length() - str2.length();
    });
    treeSet1.add("120");
    treeSet1.add("12");
    System.out.println(treeSet1);

    Consumer<String> consumer = System.out::println;
    consumer.accept("hello");

    Comparator<Integer> comparator = Integer::compare;
    System.out.println(comparator.compare(1, 3));

    Function<Student, String> function = Student::getName;
    System.out.println(function.apply(new Student("hello", 12)));

    // stream
    ArrayList<String> arrayList1 = new ArrayList<>();
    arrayList1.add("jane");
    arrayList1.add("alice");
    arrayList1.add("bob");
    Stream<String> stream = arrayList1.parallelStream();
    stream.forEach(System.out::println);

    String[] arr = {"1", "2", "3"};
    Stream<String> stream1 = Arrays.stream(arr);
    stream1.forEach(System.out::println);

    Stream<String> stream2 = Stream.of("1", "3", "5");
    stream2.forEach(System.out::println);

    Stream<Integer> stream3 = Stream.iterate(0, x -> x + 2);
    stream3.limit(12).forEach(System.out::println);

    IntStream stream4 = IntStream.of(10, 20, 30);
    stream4.forEach(System.out::println);

    arrayList1.stream().filter((e) -> e.length() > 4).forEach(System.out::println);
    arrayList1.stream().limit(2).forEach(System.out::println);
    System.out.println("wait ----");
    arrayList1.stream().sorted((str1, str2) -> str1.compareTo(str2)).forEach(
        System.out::println);
    System.out.println(Double.compare(12.00, 12.03));

//    ArrayList<Integer> arrayList2 = new ArrayList<>();
//    for (int i = 0; i < 5000000; i++) {
//      arrayList2.add(i);
//    }
//    long time = System.currentTimeMillis();
//    long count = arrayList2.stream().sorted().count();
//    System.out.println(System.currentTimeMillis() - time);

    Optional<String> min = arrayList1.stream().min((x, y) -> x.compareTo(y));
    System.out.println(min.get());

    Optional<String> sum = arrayList1.stream().reduce((x, y) -> x + y);
    System.out.println(sum.get());

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");
    ExecutorService executorService = Executors.newFixedThreadPool(10);
    Callable<Date> callable = new Callable<Date>() {
      @Override
      public Date call() throws Exception {
        synchronized (simpleDateFormat) {
          return simpleDateFormat.parse("2020425");
        }
      }
    };
//    List<Future<Date>> list1 = new ArrayList<>();
//    for (int i = 0; i < 10; i++) {
//      Future<Date> future = executorService.submit(callable);
//      list1.add(future);
//    }
//    for (Future<Date> future : list1) {
//      System.out.println(future.get());
//    }
//    executorService.shutdown();

    LocalDateTime localDateTime = LocalDateTime.now();
    System.out.println(localDateTime.minusDays(2));

    Instant instant = Instant.now();
    System.out.println(instant.toEpochMilli());
    System.out.println(System.currentTimeMillis());

//    Set<String> availableZoneList = ZoneId.getAvailableZoneIds();
//    for(String zone:availableZoneList){
//      System.out.println(zone);
//    }
    System.out.println(ZoneId.systemDefault());

    Date date = new Date();
    System.out.println(date);
    Instant instant1 = date.toInstant();
    System.out.println(instant1);

    LocalDateTime localDateTime1 = LocalDateTime.ofInstant(instant1, ZoneId.systemDefault());
    System.out.println(localDateTime1);

    System.out.println(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
    System.out.println(Date.from(instant));

    System.out.println(DateTimeFormatter.ofPattern("yyyyMMdd HH:mm:ss").format(LocalDateTime.now()));

    System.out.println(Integer.parseInt("110",2));

    ArrayList<Integer> arrayList2 = new ArrayList<Integer>(){{
      add(1);
      add(2);
    }};
    System.out.println(arrayList2);

    Map<String, String> map1 = new HashMap<>();
    map1.put("name", "bob");
    System.out.println(map1.get("name"));

  }
}
