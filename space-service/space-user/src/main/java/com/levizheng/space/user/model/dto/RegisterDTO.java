package com.levizheng.space.user.model.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author levi
 * @since 2023/02/17
 */
@Data
public class RegisterDTO {

    /**
     * 用户名
     */
    @NotBlank(message = "用户名不得为空")
    public String username;

    /**
     * 密码
     */
    @NotBlank(message = "密码不得为空")
    public String password;

    /**
     * 手机号
     */
    @NotBlank(message = "手机号不得为空")
    public String phone;

}
