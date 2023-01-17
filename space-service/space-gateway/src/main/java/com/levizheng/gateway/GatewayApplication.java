package com.levizheng.gateway;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author levi
 */
@Slf4j
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class GatewayApplication {

    public static void main(String[] args) {
        log.info("网关启动中...");
        SpringApplication.run(GatewayApplication.class, args);
    }

//    @Value("${base}")
//    private String value;

    @Value(("${gateway}"))
    private String hello;


    @GetMapping("test")
    public void test() {
//        System.out.println(value);
        System.out.println(hello);
//        System.out.println(hello2);
    }

}