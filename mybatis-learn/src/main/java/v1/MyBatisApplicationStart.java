package v1;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import v1.bean.Department;
import v1.dao.DepartmentDao;
import v1.service.DepartmentMapper;
import v1.service.impl.DepartmentDaoImpl;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisApplicationStart {

    public static void main(String[] args) throws IOException {

//        InputStream xml = Resources.getResourceAsStream("mybatis-config.xml");
//
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(xml);
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        List<Department> departmentList = sqlSession.selectList("departmentMapper.findAll");
//        departmentList.forEach(System.out::println);

        //通过接口定义的方式实现数据库查找
//        InputStream xml = Resources.getResourceAsStream("mybatis-config.xml");
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(xml);
//
//        DepartmentDao departmentDao = new DepartmentDaoImpl(sqlSessionFactory);
//        List<Department> departmentList = departmentDao.findAll();
//        departmentList.forEach(System.out::println);
//        Department department = departmentDao.findById("18ec781fbefd727923b0d35740b177ab");
//        System.out.println(department);


        //通过定义一个mapper来实现数据库查找
        InputStream xml = Resources.getResourceAsStream("mybatis-configv2.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(xml);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 获取Mapper接口的代理
        DepartmentMapper departmentMapper = sqlSession.getMapper(DepartmentMapper.class);
        Department department = departmentMapper.findById("18ec781fbefd727923b0d35740b177ab");
        System.out.println(department);
        System.out.println("&&&&&&&&&&&&&&&&&&&&");
        List<Department> departmentList = departmentMapper.findAll();
        departmentList.forEach(System.out::println);

    }
}
