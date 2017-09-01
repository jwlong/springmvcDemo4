package com.dxfjyygy.controller;

import com.dxfjyygy.com.ResultBean;
import com.dxfjyygy.entity.Person;
import com.dxfjyygy.test.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by longjinwen on 01/09/2017.
 */
@Controller
public class PersonController {
    @Autowired
    PersonService personService;


    @RequestMapping(value = "/add" ,method = RequestMethod.POST)
    public ResultBean<Integer> add(Person person){
        return  new ResultBean<Integer>(personService.add(person));
    }
}
