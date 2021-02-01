package exp;

public class Student implements User{

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return "Student{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }

  public void eat() {
    System.out.println("hello eat");
  }

  public void eat(String food) {
    System.out.println(name + "吃了" + food);
  }

  private void drink(String drink) {
    System.out.println(name + "喝了" + drink);
  }

  public static void beat(String people) {
    System.out.println("打了" + people);
  }
  public Student() {

  }

  @Override
  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  private String name;
  private int age;

  public void setName(String name) {
    this.name = name;
  }
}
