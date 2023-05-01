package com.foodsecurityconsortium.fschome.homepage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FscHomeController {

    @GetMapping("/home")
    public String home(){
        return "homepage/home";
    }
    @GetMapping("/")
    public String hosp(){
        return "hosp/index";
    }
}
