package com.example.mscomment.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.mscomment.client.repository")
public class CommentRunMain {
    public static void main(String[] args) {
        SpringApplication.run(CommentRunMain.class, args);
    }
}
