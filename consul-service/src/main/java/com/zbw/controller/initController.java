package com.zbw.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class initController {

    @RequestMapping("/")
    public String home() {
        return "Hello world";
    }
}
