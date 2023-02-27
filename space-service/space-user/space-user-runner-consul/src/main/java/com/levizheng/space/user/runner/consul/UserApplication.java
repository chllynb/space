package com.levizheng.space.user.runner.consul;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author levi
 * @since 2023/2/27
 */
@Slf4j
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = {"com.levizheng.space.user"})
public class UserApplication {
    public static void main(String[] args) {
        log.info("用户中心正在启动...");
        SpringApplication.run(UserApplication.class, args);
    }
}
