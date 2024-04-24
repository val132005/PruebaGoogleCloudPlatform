package com.val132005.HelloWorldGCP;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("exercise")
public class HelloWorld {
    @GetMapping("/sayHello")
    public String hello (@RequestParam(value = "name", defaultValue = "World") String name){
        return "Hello " + name + "!";
    }

    @GetMapping("/sayHello/{name}")
    public  String hello2 (@PathVariable String name){
        return "Hello " + name + "!";
    }

}
