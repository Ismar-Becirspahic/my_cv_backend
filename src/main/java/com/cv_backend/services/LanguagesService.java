package com.cv_backend.services;

import com.cv_backend.models.Languages;

import com.cv_backend.repositories.LanguagesRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class LanguagesService {
    private final LanguagesRepository languagesRepository;

    public LanguagesService(LanguagesRepository languagesRepository) {
        this.languagesRepository = languagesRepository;
    }

    public List<Languages> getLanguages() {
        return languagesRepository.findAll();
    }

}
