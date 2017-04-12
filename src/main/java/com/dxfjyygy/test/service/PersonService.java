package com.dxfjyygy.test.service;

import com.dxfjyygy.entity.Person;

/**
 * Created by longjinwen on 2017/2/28.
 */
public interface PersonService {

    public void testPersist(Person person) throws Exception;
    /**
     * 测试一下单向1-N  Person为一的一端
     */
    void testSaveOne2Many();
    <T> void saveObject(T obj);
    <T> Integer save(T obj);
    void testDoubleOne2Many();

    Person getPerson(int i);
}
