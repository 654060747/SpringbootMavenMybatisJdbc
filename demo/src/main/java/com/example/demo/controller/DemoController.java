package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController //@RestController注解相当于@ResponseBody ＋ @Controller合在一起的作用,返回的是return里面的，无法返回jsp页面
//@RestControllerAdvice 是 @ControllerAdvice 和 @ResponseBody的合集，可以将异常以json的格式返回数据。与@ExceptionHandler 配合完成统一异常拦截处理
@Controller
public class DemoController {
    @ResponseBody
//    @RequestMapping("/index")
    @GetMapping("/index")
    public String index(){
        return "hello spring boot";
    }
}
