package com.gtic.lab3.entity;

import jakarta.persistence.*;
import java.text.DecimalFormat;

@Entity
@Table(name = "job")
public class Job {

    @Id
    @Column(name = "job_id", length = 20)
    private String job_id;

    @Column(name = "job_title", length = 20)
    private String job_title;

    @Column(name = "min_salary")
    private DecimalFormat min_salary;

    @Column(name = "max_salary")
    private DecimalFormat max_salary;

}
