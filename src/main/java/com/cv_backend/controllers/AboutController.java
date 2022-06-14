package com.cv_backend.controllers;

import com.cv_backend.models.About;
import com.cv_backend.services.AboutService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/about")
public class AboutController {

    private final AboutService aboutService;

    public AboutController(AboutService aboutService){
        this.aboutService = aboutService;
    }

    @GetMapping
    public List<About> getAboutInfo() {
        return this.aboutService.getAboutInfo();
    }


}

