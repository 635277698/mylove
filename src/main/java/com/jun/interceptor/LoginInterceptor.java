package com.jun.interceptor;


import com.jun.entity.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle~");
        User user = (User) request.getSession().getAttribute("CURRENT_USER");
        if (user != null){
            System.out.println("always login.");
            return true; //不拦截
        }else {
            System.out.println("please login!");
            //request.getRequestDispatcher("/WEB-INF/html/login.html").forward(request,response);
            return false;
        }


    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
