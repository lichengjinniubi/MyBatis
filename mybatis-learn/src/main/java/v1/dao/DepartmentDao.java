package v1.dao;

import v1.bean.Department;

import java.util.List;

public interface DepartmentDao {

    List<Department> findAll();

    Department findById(String id);
}
