package com.example.hahow_mall.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: tcsow
 * @date: 2024/8/10
 */
@RestController

public class TestController {

    @GetMapping("/test")
    public String test(){

        return "test";
    }
}
