package com.levizheng.space.storage.service.impl;

import com.levizheng.space.minio.autoconfigurate.MinioProperties;
import com.levizheng.space.storage.service.FileService;
import io.minio.MinioClient;
import io.minio.PutObjectArgs;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author levi
 * @since 2023/01/19
 */
@AllArgsConstructor
@Service
public class FileServiceImpl implements FileService {

    private MinioProperties minioProperties;

    private MinioClient minioClient;

    @Override
    public void uploadFile(MultipartFile file) throws Exception {
        PutObjectArgs args = PutObjectArgs.builder()
                .bucket(minioProperties.getBucket())
                .object(file.getOriginalFilename())
                .stream(file.getInputStream(), file.getSize(), -1)
                .contentType(file.getContentType())
                .build();
        this.minioClient.putObject(args);

    }
}
