package com.yin.controller;


import com.yin.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ValueConstants;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by yinyuxia on 2016/5/21.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {



  @RequestMapping(value="/send", method=RequestMethod.GET)
    public void send(){
      User user=new User();
      user.setUsername("我是消息发送者");
      user.setAddress("不告诉你地址");
      //jmsService.sentUser(user);
    }


}
