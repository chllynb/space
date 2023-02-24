package com.levizheng.space.minio.autoconfigurate;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author levi
 * @since 2023/01/18
 */
@Data
@ConfigurationProperties(prefix = MinioProperties.MINIO_PREFIX)
public class MinioProperties {

    public static final String MINIO_PREFIX = "minio";

    private String endpoint;

    private String accessKey;

    private String secretKey;

    private String bucket;

    private String readPath;
}
