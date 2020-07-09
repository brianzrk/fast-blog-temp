package com.brian.fastblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FastBlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(FastBlogApplication.class, args);
        System.out.println("http://localhost:8080");
    }

}
