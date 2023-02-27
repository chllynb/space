package com.levizheng.space.user.core.controller;


import com.levizheng.space.user.core.service.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Objects;

/**
 * @author levi
 */
@RestController
@AllArgsConstructor
public class LoginController {

    private IUserService userService;

    @PostMapping("register")
    public void register(@Valid @RequestBody RegisterDTO registerDTO, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            System.out.println(Objects.requireNonNull(bindingResult.getFieldError()).getDefaultMessage());
        }
        //todo
        System.out.println("!111");
    }

}
