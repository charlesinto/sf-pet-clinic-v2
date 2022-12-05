package com.charlesinto.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {

    @RequestMapping({"/owners", "/owners.html", "owners/index", "owners/index.html"})
    public String index(){
        return "owner/index";
    }
}