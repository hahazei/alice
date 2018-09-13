package com.xw.alice.controller.api;


import com.xw.alice.model.User;
import com.xw.alice.provider.UserProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xuwei
 * @since 2018-09-12
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserProvider userProvider;

    @GetMapping("/{id}")
    public User get(@PathVariable(value = "id") String id) {
        User user = userProvider.selectById(id);
        return user;
    }
}

