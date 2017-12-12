package com.imooc.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 描述:
 *
 * @outhor sren
 * @create 2017-12-11 23:33
 */
@Data
@Component
@ConfigurationProperties(prefix = "wechat")
public  class
WechatAccountConfig {

    private String mpAppId;

    private String mpAppSecret;

}