package com.levizheng.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;


/**
 * @author levi
 * @since 2023/01/17
 */
@Configuration
public class MybatisPlusConfig {

    @Value("")
    private String url;

    private String username;

    private String password;


}
