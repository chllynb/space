package com.levizheng.space.user;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 用户中心启动类
 *
 * @author levi
 * @since 2023/02/17
 */
@Slf4j
@SpringBootApplication
public class UserApplication {
    public static void main(String[] args) {
        log.info("用户中心启动中...");
        SpringApplication.run(UserApplication.class, args);
    }

}
