package com.levizheng.space.gateway.runner.consul;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author levi
 * @since 2023/2/24
 */
@Slf4j
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = {"com.levizheng.space.gateway"})
public class GatewayApplication {
    public static void main(String[] args) {
        log.info("网关服务正在启动...");
        SpringApplication.run(GatewayApplication.class, args);
    }
}
