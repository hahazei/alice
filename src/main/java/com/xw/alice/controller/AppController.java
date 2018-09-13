package com.xw.alice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xuw-e on 2018/9/12.
 */
@RestController
public class AppController {

    @GetMapping("/test")
    public String test() {
        return "ok";
    }

}
