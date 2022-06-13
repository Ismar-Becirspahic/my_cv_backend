package com.cv_backend.models;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Year;

@Entity
@Table(name = "education")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "primary_school")
    private String primary_school;
    @Column(name = "primary_school_start_year")
    private int primary_school_start_year;
    @Column(name = "primary_school_end_year")
    private int primary_school_end_year;
    @Column(name = "high_school")
    private String high_school;
    @Column(name = "high_school_start_year")
    private int high_school_start_year;
    @Column(name = "high_school_end_year")
    private int high_school_end_year;
    @Column(name = "university")
    private String university;
    @Column(name = "university_start_year")
    private int university_start_year;
    @Column(name = "university_end_year")
    private int university_end_year;
}
