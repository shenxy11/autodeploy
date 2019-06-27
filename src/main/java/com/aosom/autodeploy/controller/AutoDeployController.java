package com.aosom.autodeploy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class AutoDeployController {
    @RequestMapping("/get")
    public String get() {
        return "Hello World!!!!!! 测试自动化部署AutoDeploy。。。";
    }
}
