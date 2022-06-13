package com.cv_backend.services;
import com.cv_backend.models.Hobbies;
import com.cv_backend.repositories.HobbiesRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class HobbiesService {
    private final HobbiesRepository hobbiesRepository;

    public HobbiesService(HobbiesRepository hobbiesRepository) {
        this.hobbiesRepository = hobbiesRepository;
    }

    public List<Hobbies> getHobbies() {
        return hobbiesRepository.findAll();
    }

}