package com.dxfjyygy.test.dao;

import com.dxfjyygy.entity.Person;

/**
 * Created by longjinwen on 2017/3/20.
 */
public interface PersonDao {
    public int save(Person person);
    public void testPersist(Person person) throws Exception;

}
