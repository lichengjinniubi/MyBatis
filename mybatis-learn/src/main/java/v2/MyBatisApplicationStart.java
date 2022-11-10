package v2;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import v2.bean.Department;
import v1.dao.DepartmentDao;
import v2.bean.User;
import v2.service.DepartmentMapper;
import v1.service.impl.DepartmentDaoImpl;
import v2.service.UserMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;
import java.util.UUID;

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



//        InputStream xml = Resources.getResourceAsStream("v2/mybatis-configv2.xml");
//        // 使用Properties的API加载这些properties文件
//        Properties properties = new Properties();
//        properties.load(Resources.getResourceAsStream("v2/jdbc.properties"));
//
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(xml, properties);
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//
//        DepartmentMapper departmentMapper = sqlSession.getMapper(DepartmentMapper.class);
//        Department department = departmentMapper.findById("18ec781fbefd727923b0d35740b177ab");
//        System.out.println(department);
        //System.out.println(department.getUsers());



        InputStream xml = Resources.getResourceAsStream("v2/mybatis-configv2.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(xml);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        //typeHandler启动的方式
//
        List<User> userList = userMapper.findAllUseTypeHandler();
        userList.forEach(System.out::println);


        //typeHandler自动识别对象插入数据库
//        User user = new User();
//        user.setId(UUID.randomUUID().toString().replaceAll("-", ""));
//        user.setName("hahahaha");
//        Department department = new Department();
//        department.setId("18ec781fbefd727923b0d35740b177ab");
//        user.setDepartment(department);
//        userMapper.saveUser(user);
//
//        // commit才能使数据库操作生效
//        sqlSession.commit();
//        sqlSession.close();


    }
}
