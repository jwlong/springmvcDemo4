package com.dxfjyygy.controller;

import com.dxfjyygy.test.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * Created by longjinwen on 2017/2/8.
 */
@Controller
public class MainController {
    @Resource(name = "personService")
    private PersonService personService;
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
       personService.userAxe();
        return "index";
    }
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(){
        personService.userAxe();
        return "login";
    }
}
