package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String homepage(Model model){
        model.addAttribute("result","see the texts represented by model");
        return "index";
    }
    @RequestMapping("/loadpage")
    public String formPage(){
        return "form";
    }

    @RequestMapping("/processform")

    public String processPage(@RequestParam ("login") String login,Model model){
     model.addAttribute("loginval",login);
        return "confirm";
    }
}
