package com.cv_backend.services;


import com.cv_backend.models.About;
import com.cv_backend.repositories.AboutRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AboutService {

    private final AboutRepository aboutRepository;

    public AboutService(AboutRepository projectRepository) {
        this.aboutRepository = projectRepository;
    }

    public List<About> getProjects() {
        return aboutRepository.findAll();
    }

    public About getOneProject(long id) {
        return getEntity(id);
    }

    public void deleteProject(long id) {
        aboutRepository.deleteById(id);
    }

    public About addProject(About project) {
        return aboutRepository.save(project);
    }

    public About updateProject(About project, long id){
        getEntity(id);
        project.setId(id);
        return aboutRepository.save(project);
    }

    private About getEntity(long id) {
        Optional<About> projectOptional = aboutRepository.findById(id);
        if(projectOptional.isPresent()) {
            return projectOptional.get();
        }
        throw new RuntimeException("Project with that id does not exist.");
    }
}

