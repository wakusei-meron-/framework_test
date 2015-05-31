package com.planet_meron.news.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.planet_meron.news"})
public class NewsWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewsWebApplication.class, args);
    }
}
