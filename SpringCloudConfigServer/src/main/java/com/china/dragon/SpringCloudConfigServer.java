package com.china.dragon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author: henry
 * @Date: 2019/8/11 0011 下午 17:04
 * @Desc
 */
@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
public class SpringCloudConfigServer extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigServer.class,args);

    }
}
