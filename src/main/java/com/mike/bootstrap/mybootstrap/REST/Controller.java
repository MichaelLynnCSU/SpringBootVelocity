package com.mike.bootstrap.mybootstrap.REST;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

        @Autowired
        private Service topService;


    // get is default method
    @RequestMapping("/")
    public String sayHi(){
        topService.say();
        return "hi";
    }

   //  get is default method
    @RequestMapping("/hello2")
    public String sayHi2(){
        return topService.say();
    }

}
