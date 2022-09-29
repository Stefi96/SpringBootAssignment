package com.stefan.demo.apis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloWorld {

    public List<String> words;

    @GetMapping("/hello-rest")
    public String greetUser(){
        return "Hello World!";
    }

    @GetMapping("hello")
    public String html(){
        return "<p>Hello world!</p>";
    }

    @GetMapping("word")
    public String returnWord(String lang){
        return "lang";
    }

}
