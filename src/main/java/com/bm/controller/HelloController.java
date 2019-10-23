package com.bm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dhy
 * @version 1.0
 * @ClassName: HelloController
 * @createTime: 2019/10/21 15:44
 * @since JDK 1.8
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(String name){
        return "你好:"+name+",今天天气不错";
    }
}
