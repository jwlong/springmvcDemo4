package com.dxfjyygy.test.dao;

import com.dxfjyygy.entity.Address;
import com.dxfjyygy.entity.Person;
import org.hibernate.SessionFactory;

/**
 * Created by longjinwen on 2017/3/20.
 */
public class PersonDaoImpl implements PersonDao {
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public int save(Person person) {
        return (Integer) sessionFactory.getCurrentSession().save(person);
    }
}
