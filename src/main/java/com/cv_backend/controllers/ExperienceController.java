package com.cv_backend.controllers;
import com.cv_backend.models.Experience;
import com.cv_backend.services.ExperienceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/experience")
public class ExperienceController {

    private final ExperienceService experienceService;

    public ExperienceController(ExperienceService experienceService) {
        this.experienceService = experienceService;
    }

    @GetMapping
    public List<Experience> getExperience() {
        return this.experienceService.getExperience();
    }
}