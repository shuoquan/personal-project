package dao;

import java.util.List;
import java.util.Map;
import mybatis.Company;

public interface CompanyDao {
  List<Map<String, Company>> findAllCompany();

  Company findByCompanyId(Integer cid);
}
