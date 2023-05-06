package com.foodsecurityconsortium.fschome.homepage;

import com.foodsecurityconsortium.fschome.homepage.people.People;
import com.foodsecurityconsortium.fschome.homepage.people.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class FscHomeController {

    @Autowired
    private PeopleService peopleService;


    @RequestMapping(value = "/people/saveredirect", method = RequestMethod.POST)
    public String saveRedirect(@ModelAttribute People people) {
        System.out.println("Email: " + people.getEmail() + "\n");

        if (people.getEmail() == null || people.getEmail().isEmpty()) {
            return "redirect:/";
        }

        peopleService.save(people);
        return "redirect:/";
    }

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

    @GetMapping("/donate")
    public String donate() {
        return "composition/donate";
    }

    @GetMapping("/.well-known/acme-challenge/-KUO2_vLVHITRPVD0c0HuRvJ-TW5HGYxwVchdU_VeOU")
    @ResponseBody
    public String acme() {
        return "-KUO2_vLVHITRPVD0c0HuRvJ-TW5HGYxwVchdU_VeOU.1y3SOmWuRSdoOwCnt04C1bmVGDSNGTWEfdsS7dmpeKk";
    }

    @GetMapping("/static")
    public String hosp() {
        return "hospital_code/index";
    }
}
