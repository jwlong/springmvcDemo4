package com.dxfjyygy.test.aopTest;

import com.dxfjyygy.controller.PersonController;
import com.dxfjyygy.entity.Person;
import com.dxfjyygy.test.service.PersonService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by longjinwen on 01/09/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:mvc-dispatcher-servlet.xml"})
public class T1 {

    @Resource
    private PersonService personService;

    private MockMvc mockMvc; //主要是为了test controller
    @Autowired
    private PersonController personController;

    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(personController).build();
    }
    @Test
    @Transactional
    @Rollback(false) //  若不加Rollback默认 为true
    public void test1(){
        Person person = new Person();
        person.setAge(12);
        person.setName("testAOP");
        personService.add(person);
    }
    @Test
    public void  testContoller1() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/add"));
    }

}
