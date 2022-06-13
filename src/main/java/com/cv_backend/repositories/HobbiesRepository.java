package com.cv_backend.repositories;

import com.cv_backend.models.Hobbies;
import com.cv_backend.models.Languages;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HobbiesRepository extends JpaRepository<Hobbies,Long> {
}
