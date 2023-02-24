package com.levizheng.space.storage;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author levi
 * @since 2023/01/18
 */
@Slf4j
@SpringBootApplication(scanBasePackages = {"com.levizheng"})
public class StorageApplication {
    public static void main(String[] args) {
        log.info("存储服务启动中...");
        SpringApplication.run(StorageApplication.class, args);
    }
}