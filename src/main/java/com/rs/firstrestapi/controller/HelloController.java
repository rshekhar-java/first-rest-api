package com.rs.firstrestapi.controller;

import com.rs.firstrestapi.model.HelloWorldBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by rs 7/15/2025.
 */
//@Controller
@RestController
public class HelloController {

    @RequestMapping("/hello-world")
    public String helloWorld() {
        return "hello world";
    }

    @RequestMapping("/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("hello world");
    }
/*
    Path Variable or path param
    //user/ravi/todos/1
*/
    @RequestMapping("/hello-world-path-param/{name}")
    public HelloWorldBean helloWorldBeanPathParam(@PathVariable String name) {
        return new HelloWorldBean("hello world, " + name);
    }
    //Multiple Path param
    @RequestMapping("/hello-world-path-param/{name}/message/{message}")
    public HelloWorldBean helloWorldBeanMultiplePathParam(@PathVariable String name, @PathVariable String message) {
        return new HelloWorldBean("hello world, " + name + ", " + message) ;
    }


}


