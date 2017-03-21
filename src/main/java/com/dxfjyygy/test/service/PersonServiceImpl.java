package com.dxfjyygy.test.service;

import com.dxfjyygy.entity.Address;
import com.dxfjyygy.entity.Person;
import com.dxfjyygy.test.dao.PersonDao;
import com.dxfjyygy.test.test1.Chinese;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by longjinwen on 2017/2/28.
 */
public class PersonServiceImpl implements PersonService
{
//    public void setPersonDao(PersonDao personDao) {
//        this.personDao = personDao;
//    }
    @Autowired
    private PersonDao personDao;
    public void save(Person person) {
        personDao.save(person);
    }

    public void testPersist(Person person) throws Exception {
        personDao.testPersist(person);
    }
}
