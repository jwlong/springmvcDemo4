package com.dxfjyygy.test.hibernateTest;

import com.dxfjyygy.entity.Address;
import com.dxfjyygy.entity.Person;
import com.dxfjyygy.test.dao.PersonDao;
import com.dxfjyygy.test.service.PersonService;
import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by longjinwen on 2017/3/20.
 */



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:mvc-dispatcher-servlet.xml"})
public class Many2OneTest  {
//    @Autowired
//    private PersonService personService;
//    @Test
//    public void test1(){
//        Person person = new Person();
//        Address address = new Address();
//        address.setAddressDetail("Dong Guan");
//        person.setName("longjinwen");
//        person.setAddress(address);
//        person.setAge(22);
//        personService.save(person);
//    }
//    @Resource
//    private PersonDao personDao;
    @Resource
    private PersonService personService;
    private Logger log = LoggerFactory.getLogger(Many2OneTest.class);
    @Test
    //@Transactional   //标明此方法需使用事务
    //@Rollback(false)  //标明使用完此方法后事务不回滚,true时为回滚
    public void test2(){
        //System.out.println("hello");
        Person person = new Person();
        Address address = new Address();
        address.setAddressDetail("Dong Guan");
        person.setName("longjinwen");
        person.setAddress(address);
        person.setAge(22);
        personService.save(person);
    }
}
