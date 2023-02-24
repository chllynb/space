package com.levizheng.space.storage.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author levi
 * @since 2023/01/19
 */
public interface FileService {

    /**
     * 上传文件
     *
     * @param file 文件
     * @throws Exception ex
     */
    void uploadFile(MultipartFile file) throws Exception;

}
