package com.dxfjyygy.test.service;

import com.dxfjyygy.entity.User;
import com.dxfjyygy.test.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by longjinwen on 2017/3/17.
 */
//@Service("userService")
//@Transactional
public class UserServiceImpl implements UserService{

//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }
    @Autowired
    private UserDao userDao;
    public void saveUsers(List<User> us) {
        for (User user :us){
            userDao.save(user);
        }
    }

    public List<User> getAllUsernames() {
        return userDao.findAll();
    }
}
