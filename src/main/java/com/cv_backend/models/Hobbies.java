package com.cv_backend.models;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "hobbies")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Hobbies {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "hobbies")
    private String hobbies;
    @Column(name = "description")
    private String description;
}