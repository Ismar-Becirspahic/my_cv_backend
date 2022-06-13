package com.cv_backend.controllers;
import com.cv_backend.models.Hobbies;
import com.cv_backend.models.Skills;
import com.cv_backend.services.SkillsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/skills")
public class SkillsController {

    private final SkillsService skillsService;

    public SkillsController(SkillsService hobbiesService) {
        this.skillsService = hobbiesService;
    }

    @GetMapping
    public List<Skills> getSkills() {
        return this.skillsService.getSkills();
    }
}