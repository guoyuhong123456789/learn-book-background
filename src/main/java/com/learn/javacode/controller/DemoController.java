package com.learn.javacode.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class DemoController {

    @GetMapping("/echo")
    public String echo() {
        return "echo";
    }
}
