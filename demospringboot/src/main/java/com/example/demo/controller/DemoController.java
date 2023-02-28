package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Controller: cho phép định nghĩa đường dẫn thường trả ra file html(giao diện)
 * @ResponseBody: chỉ trả ra String
 * @ResController = @Controller +  @ResponseBody: cho phép định nghĩa đường dẫn luôn luôn trả ra string
 * /demo
 * /demo/hello
 * /demo/detail
 * /user
 * /user/signin
 * /user/signup
 */

@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("")
    public String demo() {
        return "Hello demo";
    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }

    @GetMapping("/detail")
    public String detail(){
        return "Detail";
    }
}
