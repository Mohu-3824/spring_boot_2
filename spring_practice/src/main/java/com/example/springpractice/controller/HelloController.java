package com.example.springpractice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
     @GetMapping("/")
     public String first() {
         return "secondView";
     }
}

