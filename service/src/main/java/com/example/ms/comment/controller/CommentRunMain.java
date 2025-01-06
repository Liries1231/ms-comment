package com.example.ms.comment.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "com.example.ms.comment")
public class CommentRunMain {
    public static void main(String[] args) {
        SpringApplication.run(CommentRunMain.class, args);
    }
    @RestController
    @RequestMapping("/test")
    public class TestController {
        @GetMapping
        public String test() {
            return "Service is running";
        }
    }

}
