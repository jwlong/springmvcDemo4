package aopTest.proxyTest;

import com.dxfjyygy.entity.User;

import java.util.Date;

/**
 * Created by longjinwen on 08/09/2017.
 */
public class UserProxyServiceImpl implements UserProxyService {
    public void addUser() {
        System.out.println("add user method");
    }

    public void updateUser() {
        System.out.println("update user method");
    }

    public void deleteUser() {
        System.out.println("delete user method");
    }

    public User getUser() {
        User user = new User();
        user.setCreateTime(new Date());
        user.setUsername("test jdk proxy");
        System.out.println("get User method User:"+user.getUsername());
        return user;
    }
}
