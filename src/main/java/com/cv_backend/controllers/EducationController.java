package com.cv_backend.controllers;
import com.cv_backend.models.Education;
import com.cv_backend.services.EducationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/education")
public class EducationController {

    private final EducationService educationService;

    public EducationController(EducationService educationService) {
        this.educationService = educationService;
    }

    @GetMapping
    public List<Education> getEducation() {
        return this.educationService.getEducation();
    }
}