package com.dxfjyygy.test.service;

import com.dxfjyygy.entity.Person;

/**
 * Created by longjinwen on 2017/2/28.
 */
public interface PersonService {
    public void save(Person person);
    public void testPersist(Person person) throws Exception;
}
