package com.example.first;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @RequestMapping("/")
    // @ResponseBody
    public String handle() {
        System.out.println("This is home page.");
        return "home";
    }
}