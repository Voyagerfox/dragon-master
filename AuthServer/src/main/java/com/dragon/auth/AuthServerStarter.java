package com.dragon.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: henry
 * @Date: 2019/8/15 0015 下午 22:42
 * @Desc
 */
@EnableDiscoveryClient
@SpringBootApplication
public class AuthServerStarter extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(AuthServerStarter.class,args);
    }
}
