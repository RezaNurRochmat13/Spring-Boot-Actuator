package com.monitoring.actuator.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class IndexController {
    @RequestMapping("/")
    public String indexPage() {
        return "Index page";
    }
}
