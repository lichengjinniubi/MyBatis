package v2.dao;

import v2.bean.Department;

import java.util.List;

public interface DepartmentDao {

    List<Department> findAll();

    Department findById(String id);
}
