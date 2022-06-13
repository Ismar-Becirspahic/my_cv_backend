package com.cv_backend.services;
import com.cv_backend.models.Education;
import com.cv_backend.repositories.EducationRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EducationService {
    private final EducationRepository educationRepository;

    public EducationService(EducationRepository educationRepository) {
        this.educationRepository = educationRepository;
    }

    public List<Education> getEducation() {
        return educationRepository.findAll();
    }

}
