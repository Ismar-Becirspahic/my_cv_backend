package com.cv_backend.services;

import com.cv_backend.models.Experience;
import com.cv_backend.repositories.ExperienceRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ExperienceService {
    private final ExperienceRepository experienceRepository;

    public ExperienceService(ExperienceRepository experienceRepository) {
        this.experienceRepository = experienceRepository;
    }

    public List<Experience> getExperience() {
        return experienceRepository.findAll();
    }

}