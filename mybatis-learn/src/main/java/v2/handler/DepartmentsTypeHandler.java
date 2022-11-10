package v2.handler;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;
import v2.bean.Departments;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DepartmentsTypeHandler implements TypeHandler<Departments> {
    @Override
    public void setParameter(PreparedStatement preparedStatement, int i, Departments Departments, JdbcType jdbcType) throws SQLException {
        preparedStatement.setString(i, Departments.getId());
    }

    @Override
    public Departments getResult(ResultSet resultSet, String s) throws SQLException {
        Departments Departments = new Departments();
        Departments.setId(resultSet.getString(s));
        return  Departments;
    }

    @Override
    public Departments getResult(ResultSet resultSet, int i) throws SQLException {
        Departments Departments = new Departments();
        Departments.setId(resultSet.getString(i));
        return  Departments;
    }

    @Override
    public Departments getResult(CallableStatement callableStatement, int i) throws SQLException {
        Departments Departments = new Departments();
        Departments.setId(callableStatement.getString(i));
        return Departments;
    }
}
