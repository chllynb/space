package com.levizheng.minio.autoconfigurate;

import io.minio.MinioClient;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author levi
 * @since 2023/01/18
 */
@AllArgsConstructor
@Configuration
@EnableConfigurationProperties(MinioProperties.class)
public class MinioAutoConfiguration implements InitializingBean {

    private final MinioProperties properties;

    @Override
    public void afterPropertiesSet() throws Exception {

    }

    @Bean
    @ConditionalOnMissingBean
    public MinioClient minioClient() {
        return MinioClient.builder()
                .endpoint(properties.getEndpoint())
                .credentials(properties.getAccessKey(), properties.getSecretKey())
                .build();
    }
}
