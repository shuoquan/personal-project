package jdbc;

import dao.BoxDao;
import dao.CompanyDao;
import dao.UserDao;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.xml.transform.Result;
import mybatis.Box;
import mybatis.Company;
import mybatis.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

public class database {

  public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
    Class.forName("com.mysql.cj.jdbc.Driver");
//    Connection connection = DriverManager.getConnection(
//        "jdbc:mysql://localhost:3306/gbox_manager?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC",
//        "root", "reload123");
//    Statement statement = connection.createStatement();
//    ResultSet resultSet = statement.executeQuery("select * from users");

    // mybatis操作
    //1.读取配置文件
    InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
    //2.创建SalSessionFactory工厂(构建者模式，工厂模式）
    SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
    SqlSessionFactory factory = builder.build(in);
    //3.使用工厂生产Sqlsession对象
    SqlSession session = factory.openSession(true);
    //4.使用SqlSession创建Dao接口的代理对象（代理模式）
    UserDao userDao = session.getMapper(UserDao.class);
    //5.使用代理对象执行方法

//    查
//    List<User> users = userDao.findAll();
//    System.out.println(users.get(0).getSalt());
//  更新
//    userDao.updateUserPhone("22", 60);

// 根据条件查询
//    User user = new User();
//    user.setUsername("hehe");
//    user.setCreatedAt(1593395927);
//    List<User> userList = userDao.findUserByCondition(user);
//    System.out.println(userList);

    // select in
//    List<Integer> userIds = new ArrayList<>();
//    userIds.add(59);
//    userIds.add(60);
//    List<Map<String, User>> userList = userDao.findUserInIds(userIds);
//    System.out.println(userList.get(0).get("username"));

    // 查询company

//    List<Box> boxList = boxDao.findAllBox();
//    for(Box box:boxList){
//      System.out.println("----");
//      System.out.println(box.getCompany());
////      System.out.println(box);
//    }
//    System.out.println(companyList.get(1));

    // 注解
    List<User> userList = userDao.findAll();
    System.out.println(userList);

//    session.commit();
    //6.释放资源
    session.close();
    in.close();

  }

}
