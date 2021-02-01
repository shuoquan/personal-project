package dao;

import java.util.List;
import java.util.Map;
import mybatis.Box;

public interface BoxDao {
  List<Box> findAllBox();
  Box findByBoxId(Integer id);
}
