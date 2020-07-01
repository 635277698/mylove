package com.jun.controller;

import com.jun.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
//    @RequestMapping(value = {"/tologin",""},method = RequestMethod.GET)
//    public ModelAndView toLogin(){
//        System.out.println("come in~");
//        return new ModelAndView("login");
//    }

    @RequestMapping(value = {"/login"},method = RequestMethod.POST)
    public String login(HttpServletRequest request, HttpSession session, String username, String password){
        System.out.println("login ~~");
        System.out.println("username: "+username);
        System.out.println("password: "+password);
        if (username.equals("zhangsan")  && password.equals("123")){
            System.out.println("登录成功");

            session.setAttribute("CURRENT_USER",new User(0,username,password));
            return "show";
        }else{
            System.out.println("账号密码错误，请重新登录");
            //return "redirect:login";
            return null;
        }

    }
}
