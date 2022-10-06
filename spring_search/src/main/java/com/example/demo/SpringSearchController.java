package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpringSearchController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/blog")
    public String blog() {
        return "blog";
    }
}
