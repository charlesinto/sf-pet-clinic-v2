package com.charlesinto.springframework.sfgclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping({"", "/", "index.html"})
    public String index(Model model){

        return "index";
    }
}
