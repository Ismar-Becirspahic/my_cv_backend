package com.cv_backend.controllers;
import com.cv_backend.models.Education;
import com.cv_backend.models.Hobbies;
import com.cv_backend.services.HobbiesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/hobbies")
public class HobbiesController {

    private final HobbiesService hobbiesService;

    public HobbiesController(HobbiesService hobbiesService) {
        this.hobbiesService = hobbiesService;
    }

    @GetMapping
    public List<Hobbies> getHobbies() {
        return this.hobbiesService.getHobbies();
    }
}