package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String homePage(Model mode1) {
        mode1.addAttribute("myvar", "Say hallo to the People.");
        return "hometemplate";
    }

}
