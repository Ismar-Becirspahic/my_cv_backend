package com.cv_backend.repositories;

import com.cv_backend.models.Education;
import com.cv_backend.models.Languages;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducationRepository extends JpaRepository<Education,Long> {
}
