package com.cv_backend.services;
import com.cv_backend.models.Skills;;
import com.cv_backend.repositories.SkillsRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class SkillsService {
    private final SkillsRepository skillsRepository;

    public SkillsService(SkillsRepository skillsRepository) {
        this.skillsRepository = skillsRepository;
    }

    public List<Skills> getSkills() {
        return skillsRepository.findAll();
    }

}