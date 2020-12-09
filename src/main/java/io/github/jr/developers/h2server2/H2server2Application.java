package io.github.jr.developers.h2server2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class H2server2Application {

    @Autowired
    HelloRepository helloRepository;

    public static void main(String[] args) {
        SpringApplication.run(H2server2Application.class, args);
    }

    @GetMapping
    public List<Hello> test(){
        return helloRepository.findAll();
    }
}
