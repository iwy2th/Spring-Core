package org.example.usingqueryparameterssenddatafromclienttoserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @RequestMapping("/home/{color}")
    public String home(@PathVariable String color,
                       @RequestParam(defaultValue = "Katy") String name,
                       Model page) {
        page.addAttribute("username", name);
        page.addAttribute("color", color);
        return "home.html";
    }
}
