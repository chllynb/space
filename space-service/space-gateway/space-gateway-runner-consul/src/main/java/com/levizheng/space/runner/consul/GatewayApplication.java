package com.levizheng.space.runner.consul;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author levi
 * @since 2023/2/24
 */
@Slf4j
@SpringBootApplication
public class GatewayApplication {
    public static void main(String[] args) {
        log.info("网关服务正在启动...");
        SpringApplication.run(GatewayApplication.class, args);
    }
}
