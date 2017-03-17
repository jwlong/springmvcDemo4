package com.dxfjyygy.controller;

import com.dxfjyygy.entity.User;
import com.dxfjyygy.test.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

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
    public String login(HttpServletRequest request){
        personService.userAxe();
        User user = new User();
        System.out.println("hot hot hot 12asdf");
        System.out.println(request.getParameter("username"));
        user.setPasswd(request.getParameter("passwd"));
        user.setUsername(request.getParameter("username"));
        request.setAttribute("user",user);
        return "login";
    }
}
