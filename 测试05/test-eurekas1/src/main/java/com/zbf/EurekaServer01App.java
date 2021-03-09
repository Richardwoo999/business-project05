package com.zbf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: LCG
 * 作者: LCG
 * 日期: 2021/1/5  11:23
 * 描述:
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServer01App {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer01App.class,args);
    }

}
