package com.dxfjyygy.test.service;

import com.dxfjyygy.entity.Address;
import com.dxfjyygy.entity.Person;
import com.dxfjyygy.test.dao.PersonDao;
import com.dxfjyygy.test.test1.Chinese;

/**
 * Created by longjinwen on 2017/2/28.
 */
public class PersonServiceImpl implements PersonService
{
    public void setPersonDao(PersonDao personDao) {
        this.personDao = personDao;
    }

    private PersonDao personDao;
    public void save(Person person) {
        personDao.save(person);
    }
}
