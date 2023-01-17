package com.levizheng;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 代码生成器服务
 *
 * @author levi
 * @since 2023/01/17
 */

@Slf4j
@SpringBootApplication
public class GeneratorApplication {
    public static void main(String[] args) {
        log.info("代码生成服务正在启动");
        SpringApplication.run(GeneratorApplication.class, args);
    }
}