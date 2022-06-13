package com.cv_backend.models;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "about")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class About {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name")
    private String first_name;
    @Column(name = "last_name")
    private String last_name;
    @Column(name = "email")
    private String email;
    @Column(name = "yearsOfExperience")
    private int yearsOfExperience;
    @Column(name = "numberOfProjectsCompleted")
    private int numberOfProjectsCompleted;
    @Column(name = "description")
    private String description;
}
