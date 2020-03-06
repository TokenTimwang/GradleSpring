package com.Gradle.Auth.controller.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ license : (C) Copyright 2013-2019, SanGuo Information Technology Co., Ltd.
 * @ Author  : TimWang
 * @ FileName: CommonController.java
 * @ Time    : 2020/1/14 16:32
 * @ Software: IntelliJ IDEA
 */

@Controller
@RequestMapping("/")
public class CommonController {

    @GetMapping("/Hello")
    @ResponseBody
    public String commonController() {
        return "Hello SpringBoot";
    }
}
