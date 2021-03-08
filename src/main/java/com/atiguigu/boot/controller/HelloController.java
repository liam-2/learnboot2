package com.atiguigu.boot.controller;



import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RestController
public class HelloController {


    @RequestMapping("/bug.jpg")
    public String handle01(){
      log.info("打印");
        return "HelloWorld你好666";

    }
    //@RequestMapping(value = "/user",method = RequestMethod.GET)
    @GetMapping (value = "/user")
    public String getUser(){
        return "GET-张三";
    }

    @PostMapping (value = "/user")
    public String saveUser(){
        return "POST-张三";
    }


    @PutMapping (value = "/user")
    public String putUser(){
        return "PUT-张三";
    }

    @DeleteMapping(value = "/user")
    public String deleteUser(){
        return "DELETE-张三";
    }




}
