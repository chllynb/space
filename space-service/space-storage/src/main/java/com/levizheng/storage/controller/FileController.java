package com.levizheng.storage.controller;

import com.levizheng.storage.service.FileService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author levi
 * @since 2023/01/19
 */
@RestController
@RequestMapping("file")
@AllArgsConstructor
public class FileController {

    private FileService fileService;


}
