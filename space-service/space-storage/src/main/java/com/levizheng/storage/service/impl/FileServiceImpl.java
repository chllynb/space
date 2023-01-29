package com.levizheng.storage.service.impl;

import com.levizheng.storage.service.FileService;
import io.minio.MinioClient;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author levi
 * @since 2023/01/19
 */
@AllArgsConstructor
@Service
public class FileServiceImpl implements FileService {

    //    private final FileStorageService fileStorageService;
    private MinioClient minioClient;

    public void test() {

    }

}
