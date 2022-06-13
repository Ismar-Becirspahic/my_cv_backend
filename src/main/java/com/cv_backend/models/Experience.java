package com.cv_backend.models;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "experience")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "project_name")
    private String project_name;
    @Column(name = "description")
    private String description;
    @Column(name = "purpose")
    private String purpose;
    @Column(name = "start_date")
    private LocalDate start_date;
    @Column(name = "end_date")
    private LocalDate end_date;
    @Column(name = "page_link")
    private String page_link;
    @Column(name = "git_link")
    private String git_link;
}
