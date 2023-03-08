package com.levizheng.space.ai.runner.consul;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author levi
 * @since 2023/03/08
 */
@Slf4j
@SpringBootApplication
public class AiApplication {
    public static void main(String[] args) {
        log.info("ai服务正在启动...");
        SpringApplication.run(AiApplication.class, args);
    }
}
