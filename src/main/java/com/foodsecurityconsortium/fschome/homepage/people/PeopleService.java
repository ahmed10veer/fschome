package com.foodsecurityconsortium.fschome.homepage.people;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeopleService {
    @Autowired
    private PeopleRepository peopleRepository;

    public People save(People people) {
        // todo add validation

        try {
            return peopleRepository.save(people);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
