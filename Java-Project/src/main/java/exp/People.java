package exp;

public class People {
  String name;
  public String getName(){
    return name;
  }
  public static void main(String[] args) {
    People p = new People();
    System.out.println(p.name);
  }
}
