package com.levizheng.minio.service;

import io.minio.errors.*;

import java.io.IOException;
import java.io.InputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/**
 * @author levi
 * @since 2023/01/18
 */
public interface FileStorageService {

    /**
     * 上传文件
     *
     * @param prefix
     * @param filename
     * @param inputStream
     * @return
     */
    String uploadFile(String prefix, String filename, InputStream inputStream) throws ServerException, InsufficientDataException, ErrorResponseException, IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidResponseException, XmlParserException, InternalException;

    /**
     * 下载文件
     *
     * @param pathUrl
     * @return
     */
    byte[] downloadFile(String pathUrl);

    /**
     * 删除文件
     *
     * @param pathUrl
     */
    void delteFile(String pathUrl);
}
