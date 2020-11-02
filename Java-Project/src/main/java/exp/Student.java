package exp;

public class Student implements User{

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
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
