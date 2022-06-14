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

    public List<About> getAboutInfo() {
        return aboutRepository.findAll();
    }
}

