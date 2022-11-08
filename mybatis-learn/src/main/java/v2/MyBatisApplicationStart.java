package v2;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import v2.bean.Department;
import v1.dao.DepartmentDao;
import v2.service.DepartmentMapper;
import v1.service.impl.DepartmentDaoImpl;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

public class MyBatisApplicationStart {

    public static void main(String[] args) throws IOException {

//        InputStream xml = Resources.getResourceAsStream("v2/mybatis-config.xml");
//
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(xml);
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        List<Department> departmentList = sqlSession.selectList("departmentMapper.findAll");
//        departmentList.forEach(System.out::println);
//
//        Department department = sqlSession.selectOne("departmentMapper.findById","18ec781fbefd727923b0d35740b177ab");
//        System.out.println(department);


        //通过接口定义的方式实现数据库查找
//        InputStream xml = Resources.getResourceAsStream("v2/mybatis-config.xml");
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(xml);
//
//        DepartmentDao departmentDao = new DepartmentDaoImpl(sqlSessionFactory);
//        List<Department> departmentList = departmentDao.findAll();
//        departmentList.forEach(System.out::println);
//        Department department = departmentDao.findById("18ec781fbefd727923b0d35740b177ab");
//        System.out.println(department);


        //通过定义一个mapper来实现数据库查找
//        InputStream xml = Resources.getResourceAsStream("v2/mybatis-configv2.xml");
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(xml);
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//
//        // 获取Mapper接口的代理
//        DepartmentMapper departmentMapper = sqlSession.getMapper(DepartmentMapper.class);
//        Department department = departmentMapper.findById("18ec781fbefd727923b0d35740b177ab");
//        System.out.println(department);
//        System.out.println("&&&&&&&&&&&&&&&&&&&&");
//        List<Department> departmentList = departmentMapper.findAll();
//        departmentList.forEach(System.out::println);



        InputStream xml = Resources.getResourceAsStream("v2/mybatis-configv2.xml");
        // 使用Properties的API加载这些properties文件
        Properties properties = new Properties();
        properties.load(Resources.getResourceAsStream("v2/jdbc.properties"));

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(xml, properties);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        DepartmentMapper departmentMapper = sqlSession.getMapper(DepartmentMapper.class);
        Department department = departmentMapper.findById("18ec781fbefd727923b0d35740b177ab");
        System.out.println(department);
        //System.out.println(department.getUsers());

    }
}
