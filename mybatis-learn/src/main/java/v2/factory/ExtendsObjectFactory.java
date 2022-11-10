package v2.factory;

import org.apache.ibatis.reflection.factory.DefaultObjectFactory;
import v2.bean.User;

public class ExtendsObjectFactory extends DefaultObjectFactory {

    @Override
    public <T> T create(Class<T> type) {
        T t = super.create(type);
        if (User.class.equals(type)) {
            User user = (User) t;
            user.setAge(0);
        }
        return t;
    }
}
