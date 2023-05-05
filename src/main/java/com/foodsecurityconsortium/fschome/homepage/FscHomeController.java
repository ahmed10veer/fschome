package com.foodsecurityconsortium.fschome.homepage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FscHomeController {

    @GetMapping("/about")
    public String about(){
        return "composition/about";
    }

//    @GetMapping("/")
    @GetMapping({"/", ""})
    public String home() {
        return "composition/home";
    }
    @GetMapping("/static")
    public String hosp(){
        return "hospital_code/index";
    }
}
