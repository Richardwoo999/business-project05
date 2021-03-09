package com.zbf.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author: LCG
 * 作者: LCG
 * 日期: 2021/1/5  15:29
 * 描述:
 */
@RestController
@RequestMapping("c2")
public class TestCliController02 {

  /*  @Autowired
    private RestTemplate restTemplate;
*/

    @Value("${server.port}")
    private String port;

  /*  @RequestMapping("test02")
    public String test01(){

        String s = restTemplate.postForObject("http://localhost:11001/c1/test01", null, String.class);

        return "client02"+s;

    }*/

    @RequestMapping("test02")
    public String test01(){

        return "client02-->"+port;

    }



}
