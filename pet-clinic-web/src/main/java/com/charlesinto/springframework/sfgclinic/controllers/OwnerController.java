package com.charlesinto.springframework.sfgclinic.controllers;

import com.charlesinto.springframework.sfgclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("owners")
@Controller
public class OwnerController {
    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }


    @RequestMapping({"", "/", "index", "index.html"})
    public String listOwners(Model model){
        System.out.println(ownerService.findAll());
        model.addAttribute("owners", ownerService.findAll());
        return "owners/index";
    }
}
