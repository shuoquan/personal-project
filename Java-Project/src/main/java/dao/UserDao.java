package dao;

import java.util.List;
import java.util.Map;
import mybatis.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface UserDao {
  // 使用注解
//  @Select("select * from users limit 1")
//  List<User> findAll();
  @Select("select * from gbox_manager.users")
//  @Results(value = {
//      @Result(column = "username", property = "name")
//  })
  List<User> findAll();

//  void updateUserPhone(@Param("phone") String phone, @Param("id") long id);
//
//  // 根据传入参数查询
//  List<User> findUserByCondition(User user);
//
//  // select in
//  List<Map<String, User>> findUserInIds(List<Integer> userIds);
}
