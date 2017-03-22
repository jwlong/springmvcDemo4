package com.dxfjyygy.test.dao;

import com.dxfjyygy.entity.User;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by longjinwen on 2017/3/17.
 */
@Repository
public class UserDaoImpl_bak implements UserDao {
   @Autowired
    private SessionFactory sessionFactory;
//    public void setSessionFactory(SessionFactory sessionFactory) {
//        this.sessionFactory = sessionFactory;
//    }
    @Transactional
    public int save(User user) {
        //HTTP Status 500 - Request processing failed; nested exception is org.hibernate.HibernateException:
        // Could not obtain transaction-synchronized Session for current thread
        //所以我想可能有这样的解决办法，1在配置关于Hibernate 的相关配置时，的那个属性
          //<!--<prop key="hibernate.current_session_context_class">thread</prop>--> .让它自己管理自己的事务Session自己处理
        //经过测试加上了会出现HTTP Status 500 - Request processing failed; nested exception is org.hibernate.HibernateException: save is not valid without active transaction
       //此时可以尝试在上面上加上Transactional注解查看效果
        return (Integer) sessionFactory.getCurrentSession().save(user);
    }

    public List<User> findAll() {
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(User.class);
        return criteria.list();
    }
}
