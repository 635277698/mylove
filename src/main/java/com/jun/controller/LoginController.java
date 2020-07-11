package com.jun.controller;

import com.jun.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class LoginController {
//    @RequestMapping(value = {"/tologin",""},method = RequestMethod.GET)
//    public ModelAndView toLogin(){
//        System.out.println("come in~");
//        return new ModelAndView("login");
//    }

    @RequestMapping(value = {"/login"},method = RequestMethod.POST)
    public ModelAndView login(HttpServletRequest request, HttpSession session, @RequestBody User user){
        System.out.println("login ~~");
        System.out.println(user);
        return null;
        //System.out.println("password: "+password);
//        if (username.equals("zhangsan")  && password.equals("123")){
//            System.out.println("登录成功");
//            session.setAttribute("CURRENT_USER",new User(0,username,password));
//            return new ModelAndView("show","username",username);
//        }else{
//            System.out.println("账号密码错误，请重新登录");
//            return new ModelAndView("login","errorMsg","login failed.");
//            //return null;
//        }

    }
}
