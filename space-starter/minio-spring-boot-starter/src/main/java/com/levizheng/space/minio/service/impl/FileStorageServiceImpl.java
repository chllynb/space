package com.levizheng.space.minio.service.impl;

import com.levizheng.space.minio.service.FileStorageService;
import io.minio.DownloadObjectArgs;
import io.minio.MinioClient;
import io.minio.UploadObjectArgs;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.InputStream;

/**
 * @author levi
 * @since 2023/01/18
 */
@Slf4j
@AllArgsConstructor
@Service
public class FileStorageServiceImpl implements FileStorageService {

    private final MinioClient minioClient;


    @Override
    public String uploadFile(String prefix, String filename, InputStream inputStream) {
        try {
            UploadObjectArgs args = UploadObjectArgs.builder().build();
            this.minioClient.uploadObject(args);
            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public byte[] downloadFile(String pathUrl) {

        try {
            this.minioClient.downloadObject(DownloadObjectArgs.builder()
                    .bucket("")
                    //minio文件
                    .object("")
                    //下载后的文件
                    .filename("")
                    .build());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        return new byte[0];
    }

    @Override
    public void deleteFile(String pathUrl) {

    }


}
