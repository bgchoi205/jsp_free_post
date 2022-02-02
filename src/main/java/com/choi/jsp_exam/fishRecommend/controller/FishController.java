package com.choi.jsp_exam.fishRecommend.controller;

import com.choi.jsp_exam.fishRecommend.service.FishService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class FishController {

    private final FishService fishService;

    @GetMapping("/")
    public String showIndex(Model model){

        String test = "jspTest...please";
        model.addAttribute("test", test);

        return "index";
    }



}
