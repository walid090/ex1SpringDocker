package com.sesame.dockerex1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class DockerEx1Application {

    public static void main(String[] args) {
        SpringApplication.run(DockerEx1Application.class, args);
    }
    @GetMapping("/test")
    public String heloo() {
        return  "Hello World";
    }
}
