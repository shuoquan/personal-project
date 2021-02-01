package exp;

public enum Gender {
  // 枚举中必须包含常量
  MALE, FEMALE;
  private String age;
  // 构造方法必须私有
  private Gender() {

  }

  public void show() {
    System.out.println("show");
  }

  public static void eat() {
    System.out.println("eat");
  }
}
