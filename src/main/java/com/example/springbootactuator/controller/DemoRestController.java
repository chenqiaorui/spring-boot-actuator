package com.example.springbootactuator.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// 用于标注控制层组件
@RestController
public class DemoRestController {

    @GetMapping("/test")
//    @ResponseBody
    public String test() {
        return "ok";
    }

}

