package com.jenkins.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: BlueSky
 * Date: 2020-07-04 22:06
 * Description: 测试自动部署
 */

@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "自动部署测试";
    }
}
