package ui;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.impl.UserServiceImpl;

public class home {

  @Test
  public void sayHello(){

  }

  public static void main(String[] args) {
//    UserService userService = new UserServiceImpl();
//    userService.getUser();
//    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-annotation.xml");
//    UserService userService = applicationContext.getBean("userServiceImpl", UserService.class);
//    UserService userService1 = applicationContext.getBean("UserService", UserService.class);
//    userService.getUser();
//    System.out.println(Integer.MAX_VALUE);
//    System.out.println(userService==userService1);

    ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("beans-aop.xml");
    UserServiceImpl userService1 = applicationContext1.getBean("UserService", UserServiceImpl.class);
    userService1.getUser();
  }
}
