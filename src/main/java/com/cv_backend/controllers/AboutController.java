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
    public List<About> getProjects() {
        return this.aboutService.getProjects();
    }

    @GetMapping("/{id}")
    public About getOneProject(@PathVariable long id) {
        return this.aboutService.getOneProject(id);
    }

    @DeleteMapping("/{id}")
    public void deleteProject(@PathVariable long id) {
        aboutService.deleteProject(id);
    }

    @PostMapping
    public About addProject(@RequestBody About project) { return aboutService.addProject(project);
    }
    @PutMapping("/{id}")
    public About updateProject(@RequestBody About project, @PathVariable long id){
        return aboutService.updateProject(project, id);
    }


}

