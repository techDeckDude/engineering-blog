package com.blog.techdeckdude.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MVCController {
    @GetMapping("/")
    public String homePage() {
        return "home";
    }
}
