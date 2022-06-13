package com.cv_backend.repositories;

import com.cv_backend.models.Experience;
import com.cv_backend.models.Languages;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExperienceRepository extends JpaRepository<Experience,Long> {
}
