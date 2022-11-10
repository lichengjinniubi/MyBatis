package v2.service;

import v2.bean.User;

import java.util.List;

public interface UserMapper {

    List<User> findAllUseTypeHandler();

    void saveUser(User user);
}
