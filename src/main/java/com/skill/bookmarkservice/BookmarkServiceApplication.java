package com.skill.bookmarkservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableDiscoveryClient
@EnableJpaAuditing
@EnableFeignClients
@SpringBootApplication
public class BookmarkServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookmarkServiceApplication.class, args);
    }

}
