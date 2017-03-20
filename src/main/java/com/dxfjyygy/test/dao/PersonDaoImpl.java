package com.dxfjyygy.test.dao;

import com.dxfjyygy.entity.Address;
import com.dxfjyygy.entity.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by longjinwen on 2017/3/20.
 */
public class PersonDaoImpl implements PersonDao {

    @Autowired
    private SessionFactory sessionFactory;
//    public void setSessionFactory(SessionFactory sessionFactory) {
//        this.sessionFactory = sessionFactory;
//    }

    public int save(Person person) {
       Session session = sessionFactory.openSession();
        return (Integer) session.save(person);
    }
}
