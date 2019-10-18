package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class Test
{

    //自动注入
    @Autowired
    private UserService UserService;

    @RequestMapping(value = "/tologin.action")
    public String index(){
        return "login";
    }

    @RequestMapping(value = "login.action")
    public ModelAndView login(User user, HttpServletRequest request, HttpSession session){
        ModelAndView mav = new ModelAndView();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        user.setUsername(username);
        user.setUserpwd(password);
        User user1 = UserService.login(user);
        System.out.println(user1);
        if(user1 != null){
            session.setAttribute("Users",user1);
            mav.setViewName("detail");
            System.out.println(mav);
            return mav;
        }else{

            session.setAttribute("errormsg","密码或账户输入错误，请重新输入");
        }
        mav.setViewName("login");
        return mav;
    }

}
