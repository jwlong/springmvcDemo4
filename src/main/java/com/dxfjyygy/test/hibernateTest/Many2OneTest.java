package com.dxfjyygy.test.hibernateTest;

import com.dxfjyygy.entity.Address;
import com.dxfjyygy.entity.Person;
import com.dxfjyygy.test.service.PersonService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by longjinwen on 2017/3/20.
 */
public class Many2OneTest  {
    @Autowired
    private PersonService personService;
    @Test
    public void test1(){
        Person person = new Person();
        Address address = new Address();
        address.setAddressDetail("Dong Guan");
        person.setName("longjinwen");
        person.setAddress(address);
        person.setAge(22);
        personService.save(person);
    }
}
