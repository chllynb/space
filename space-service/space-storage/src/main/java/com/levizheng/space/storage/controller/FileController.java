package com.levizheng.space.storage.controller;

import com.levizheng.space.storage.service.FileService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author levi
 * @since 2023/01/19
 */
@RestController
@RequestMapping("file")
@AllArgsConstructor
public class FileController {

    private FileService fileService;

    @PostMapping
    public void uploadFile(MultipartFile file) {
        try {
            this.fileService.uploadFile(file);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
