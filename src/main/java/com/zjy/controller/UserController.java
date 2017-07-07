package com.zjy.controller;

import com.zjy.pojo.User;
import com.zjy.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 * Created by ZhaoJunYong on 2017/7/7.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping("/showUser")
    public String toIndex(User user, Integer id, HttpServletRequest request, Model model) {
        id.intValue();// 参数自动注入
        user.getId().intValue();// 参数自动注入
        int userId = Integer.parseInt(request.getParameter("id"));
        user = this.userService.getUserById(userId);//
        model.addAttribute("user", user);
        /*return "user/showUser";*/
        return "showUser";  //此处和spring-
    }

    @RequestMapping("/date")
    public String date(@RequestHeader("Host") String Host, Date date, String name, Map<String, Object> map,
                       Model model) {

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String strDate = dateFormat.format(date);
        System.out.println(strDate);

        System.out.println(name);
        System.out.println(Host);
        map.put("name", name);
        model.addAttribute("date", strDate);
        return "/user/date";
    }

    @RequestMapping("/dateFormat")
    public String dateFormat(@RequestHeader("Host") String Host, String num, Date date, String name,
                             Map<String, Object> map, Model model) {

        System.out.println(date);

        System.out.println(name);
        System.out.println(Double.parseDouble(num)+122);
        map.put("name", name);
        model.addAttribute("date", date);
        return "/user/date";
    }
}