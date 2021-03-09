package com.zbf.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author: LCG
 * 作者: LCG
 * 日期: 2021/1/5  15:32
 * 描述:
 */
//@Configuration
public class TestC2Config {

    /**
     * 作者: LCG
     * 日期: 2021/1/5  15:34
     * 描述: 
     * @Param []
     * @Return org.springframework.web.client.RestTemplate
     */
    @Bean
    public RestTemplate  getRestTemplate(){

        return new RestTemplate();
    }

}
