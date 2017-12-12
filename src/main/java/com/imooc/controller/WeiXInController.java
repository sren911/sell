package com.imooc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 描述:
 *
 * @outhor sren
 * @create 2017-12-11 22:29
 */
@RestController
@RequestMapping("/weixin")
@Slf4j
public class WeiXInController {

    @GetMapping("/auth")
    public void auth(String code) {
        log.info("进入auth方法");
        log.info("code={}", code);

        String url = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=wx122f7789fd1d3778&secret=45215c62b831f74479e3538939a8f75b&code="+code+"&grant_type=authorization_code";
        RestTemplate restTemplate = new RestTemplate();
        String s = restTemplate.getForObject(url, String.class);
        log.info("s={}", s);
    }

}