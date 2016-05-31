package com.yin.controller;


import com.yin.entity.User;
import com.yin.service.UserService;

import org.apache.commons.io.FileUtils;
import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by yinyuxia on 2016/5/17.
 */
@Controller
@RequestMapping("/user")
public class HomeController {

    private UserService userService;

    @RequestMapping(value = "/toRegister",method = RequestMethod.GET)
    public String toRresiter(){
        return "register";
    }
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public ModelAndView register(User user){
        user.setCreatetime(new Date());
           userService.saveUser(user);
        return new ModelAndView("/resources/index.html");
    }
   @RequestMapping(value = "/{id}",method = RequestMethod.GET)
   public String getUser(@PathVariable long id,Model model){
       return "/login";
   }
    @RequestMapping(value="/login",method = RequestMethod.GET)
    public String login(HttpServletRequest request){
     String username=request.getParameter("username");
        String password=request.getParameter("password");
        String vCode=request.getParameter("vCode");
       HttpSession session=request.getSession();
        if(!session.getAttribute("checkCode").equals(vCode)){
            return "login";
        }else{
            return "redirect:/user/userInfo";
        }
    }
    @RequestMapping(value = "/userInfo",method = RequestMethod.GET)
    public String getUserInfo(HttpServletRequest request){
     List<User> userList=userService.getUserList();
        request.setAttribute("userList",userList);
        return "userInfo";
    }
}
