package com.levizheng.minio.autoconfigurate;

import io.minio.MinioClient;
import lombok.AllArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

/**
 * @author levi
 * @since 2023/01/18
 */
@AllArgsConstructor
@Configuration
@EnableConfigurationProperties(MinioProperties.class)
public class MinioAutoConfiguration {

    private final MinioProperties properties;

    @Bean
    @Order(1)
    @ConditionalOnMissingBean
    public MinioClient minioClient() {
        return MinioClient.builder()
                .endpoint(properties.getEndpoint())
                .credentials(properties.getAccessKey(), properties.getSecretKey())
                .build();
    }
}
