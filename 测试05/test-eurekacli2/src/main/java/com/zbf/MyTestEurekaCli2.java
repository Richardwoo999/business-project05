package com.zbf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: LCG
 * 作者: LCG
 * 日期: 2021/1/5  15:22
 * 描述:
 */
@SpringBootApplication
@EnableEurekaClient
public class MyTestEurekaCli2 {

    public static void main(String[] args) {
        SpringApplication.run(MyTestEurekaCli2.class,args);
    }

}
