package com.example.controller;


import com.example.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class SpringBootController {

    private  String  name;

    @Autowired
    private Student student;

    @RequestMapping("/sayhello")
    @ResponseBody
    public  String  say(){
        return student.getName() + student.getAge();
    }


    @RequestMapping(value = "/springBoot/jsp")
    public String jsp(Model model) {
        model.addAttribute("data","SpringBoot 前端使用 JSP 页面！");
        return "index";
    }
}
