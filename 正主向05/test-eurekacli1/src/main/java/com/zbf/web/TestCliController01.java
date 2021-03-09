package com.zbf.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * @author: LCG
 * 作者: LCG
 * 日期: 2021/1/5  15:29
 * 描述:
 */
@RestController
@RequestMapping("c1")
public class TestCliController01 {

    @Value("${server.port}")
    private String port;


    @RequestMapping("test01")
    public String test01(HttpServletRequest httpServletRequest){

        Cookie[] cookies = httpServletRequest.getCookies();

        return "client01--->"+port;

    }

}
