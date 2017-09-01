package com.dxfjyygy.test.dao;

import com.dxfjyygy.entity.User;
import com.dxfjyygy.test.dao.UserDao;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by longjinwen on 2017/3/17.
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Resource
    private SessionFactory sessionFactory;
//    public void setSessionFactory(SessionFactory sessionFactory) {
//        this.sessionFactory = sessionFactory;
//    }
    @Transactional
    public int save(User user) {
        return (Integer) sessionFactory.getCurrentSession().save(user);
    }

    public List<User> findAll() {
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(User.class);
        return criteria.list();
    }
}
