package com.cv_backend.controllers;
import com.cv_backend.models.Languages;
import com.cv_backend.services.LanguagesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/languages")
public class LanguagesController {

    private final LanguagesService languagesService;

    public LanguagesController(LanguagesService languagesService) {
        this.languagesService = languagesService;
    }

    @GetMapping
    public List<Languages> getLanguages() {
        return this.languagesService.getLanguages();
    }
}