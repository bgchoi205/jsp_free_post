package com.choi.jsp_exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostController {

    @GetMapping("/")
    public String showIndex(Model model){

        String test = "jspTest...please";
        model.addAttribute("test", test);

        return "index";
    }
}
