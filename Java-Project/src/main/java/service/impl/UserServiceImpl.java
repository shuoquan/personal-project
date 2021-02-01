package service.impl;

import java.util.Date;
import org.springframework.stereotype.Component;
import service.UserService;

@Component
public class UserServiceImpl implements UserService {
  private String name;
  private Integer age;

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  private Date date;
//  public UserServiceImpl(String name, Integer age, Date date) {
//    this.name = name;
//    this.age = age;
//    this.date = date;
//  }

  @Override
  public void getUser() {
    System.out.println("hello world");
    System.out.println(name);
    System.out.println(age);
    System.out.println(date);
  }
}
