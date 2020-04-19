package com.outdd.customer.controller;

import com.outdd.common.base.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.provider.authentication.OAuth2AuthenticationProcessingFilter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author vaie
 * @Created 2019/1/28 15:20
 */
@RestController
public class ClientController {
    @Autowired
    RedisUtil redisUtil;
    @Autowired
    PasswordEncoder passwordEncoder;

    @Value("${spring.datasource.name}")
    String name;

    @GetMapping("/index")
    public String index(String passwParam) {
        OAuth2AuthenticationProcessingFilter wqe;
        String passw=passwordEncoder.encode(passwParam);
        return "this is index:"+name +" passw1:"+passw;
    }



}
