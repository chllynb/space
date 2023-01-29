package com.levizheng.minio.autoconfigurate;

import io.minio.BucketExistsArgs;
import io.minio.MakeBucketArgs;
import io.minio.MinioClient;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author levi
 * @since 2023/01/29
 */
@Slf4j
@Order(2)
@AllArgsConstructor
@Component
public class MinioRunner implements ApplicationRunner {

    private final MinioClient minioClient;

    private final MinioProperties minioProperties;

    /**
     * 初始化bucket
     *
     * @param args args
     * @throws Exception ex
     */
    @Override
    public void run(ApplicationArguments args) throws Exception {
        boolean isExist = this.minioClient.bucketExists(BucketExistsArgs.builder()
                .bucket(minioProperties.getBucket()).build());
        if (!isExist) {
            this.minioClient.makeBucket(MakeBucketArgs.builder()
                    .bucket(minioProperties.getBucket()).build());
        }
    }
}
