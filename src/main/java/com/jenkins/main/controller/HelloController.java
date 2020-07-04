package com.jenkins.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: BlueSky
 * Date: 2020-07-03 18:58
 * Description: 问候语
 */

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello jenkins--maven-git";
    }
}
