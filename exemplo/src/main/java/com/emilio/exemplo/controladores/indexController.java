package com.emilio.exemplo.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {

    @GetMapping("/")
    public String inedx(){
        return "index";
    }
    
}
