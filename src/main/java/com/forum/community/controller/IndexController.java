package com.forum.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

//    @GetMapping("/hello")
//    public String hello(@RequestParam(name = "name") String name, Model model)  {
//        // we need add this attribute to the model
//        model.addAttribute("name", name);
//        // find a template called hello within resources/templates
//        return "index";
//    }

    @GetMapping("/")
    public String index() { return "index"; }
}
