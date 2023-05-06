package com.foodsecurityconsortium.fschome.homepage.people;

import com.foodsecurityconsortium.fschome.homepage.base.BaseResponse;
import com.foodsecurityconsortium.fschome.homepage.base.ResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/people")
public class PeopleController {

    @Autowired
    private PeopleService peopleService;

    @PostMapping("/save")
    public BaseResponse save(@RequestBody People people) {
        people = peopleService.save(people);
        return new BaseResponse(
                ResponseStatus.SUCCESS,
                "success",
                people
        );
    }

//    @GetMapping("/save")
//    public BaseResponse saveGet() {
//        People people = new People(
//                null,
//                "fn",
//                "ln",
//                "occu",
//                "occu",
//                "inst",
//                "ema",
//                "pho"
//
//                );
//
//        people = peopleService.save(people);
//        return new BaseResponse(
//                ResponseStatus.SUCCESS,
//                "success: id= " + people.getId(),
//                people
//        );
//    }


}
