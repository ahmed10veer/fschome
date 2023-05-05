package com.foodsecurityconsortium.fschome.homepage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FscHomeController {

    @GetMapping({"/", ""})
    public String home() {
        return "composition/home";
    }

    @GetMapping("/about")
    public String about() {
        return "composition/about";
    }

    @GetMapping("/whatwedo")
    public String whatWeDo() {
        return "composition/what_we_do";
    }

    @GetMapping("/funding")
    public String funding() {
        return "composition/funding";
    }

    @GetMapping("/blog")
    public String blog() {
        return "composition/blog";
    }

        @GetMapping("/research")
    public String research() {
        return "composition/research";
    }

        @GetMapping("/howtohelp")
    public String howToHelp() {
        return "composition/how_to_help";
    }
//    @GetMapping("/donate")

    public String donate() {
        return "composition/donate";
    }

    @GetMapping("/static")
    public String hosp() {
        return "hospital_code/index";
    }
}
