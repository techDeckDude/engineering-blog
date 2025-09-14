package com.blog.techdeckdude.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/v1/blog")
public class BlogRestController {
    @PostMapping("/blogPost")
    public void createBlogPost() {

    }
}
