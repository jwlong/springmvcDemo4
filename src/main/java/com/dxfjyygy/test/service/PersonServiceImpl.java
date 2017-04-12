package com.dxfjyygy.test.service;

import com.dxfjyygy.entity.Person;
import com.dxfjyygy.test.dao.PersonDao;
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
    public Long save(Person person) {
        personDao.save(person);
        return null;
    }

    public void testPersist(Person person) throws Exception {
        personDao.testPersist(person);
    }
    public void testSaveOne2Many(){
        personDao.testSaveOne2Many();
    }

    public <T> void saveObject(T obj) {
        personDao.saveObject(obj);
    }

    public <T> Integer save(T obj) {
        return  personDao.save(obj);
    }

    public void testDoubleOne2Many() {
        personDao.testDoubleOne2Many();
    }

    public Person getPerson(int i) {
       return personDao.findObject(Person.class,i);
    }


}
