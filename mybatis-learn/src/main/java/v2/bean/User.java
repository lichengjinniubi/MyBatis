package v2.bean;

import java.util.Date;
import java.util.Objects;

public class User {
    
    private String id;
    
    private String name;
    
    private Integer age;
    
    private Date birthday;


    private Departments departments_id;


    private Departments department;

    private Department department_id;
    
    @Override
    public String toString() {
        return "User{" + "id='" + id + '\'' + ", name='" + name + '\'' + ", department=" + departments_id + '}';
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Integer getAge() {
        return age;
    }
    
    public void setAge(Integer age) {
        this.age = age;
    }
    
    public Date getBirthday() {
        return birthday;
    }
    
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    
//    public Departments getDepartment() {
//        return department;
//    }
//
//    public void setDepartments(Departments department) {
//        this.department = department;
//    }
    
    public Departments getDepartments_id() {
        return departments_id;
    }

    public void setDepartments_id(Departments departments_id) {
        this.departments_id = departments_id;
    }

    public Department getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(Department department_id) {
        this.department_id = department_id;
    }
}
