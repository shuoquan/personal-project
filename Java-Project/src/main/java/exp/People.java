package exp;

public class People {
  String name;
  @Annotation(name = "bob", age = 12)
  public String getName(){
    return name;
  }
  public static void main(String[] args) {
    People p = new People();
    System.out.println(p.getName());
  }
}
