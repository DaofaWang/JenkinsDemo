package com.wdf.jenkins.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date: 2023-03-11
 * @Author: wdf
 * @Description:
 */
@RestController
public class IndexController {
    @RequestMapping({"/"})
    public String hello(){
        return "hello";
    }
}
