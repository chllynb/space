package com.levizheng.space.storage.utils;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author levi
 * @since 2023/01/29
 */
public class FileUtils {


    public static void test(MultipartFile file) {
        System.out.println(file.getName());
        System.out.println(file.getOriginalFilename());
    }
}
