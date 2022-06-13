package com.cv_backend.repositories;

import com.cv_backend.models.About;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AboutRepository extends JpaRepository<About,Long> {
}
