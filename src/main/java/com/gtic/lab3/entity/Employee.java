package com.gtic.lab3.entity;

import jakarta.persistence.*;
import java.text.DecimalFormat;
import java.util.Date;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @Column(name = "employee_id")
    private Integer employee_id;

    @Column(name = "first_name", length = 20)
    private String first_name;

    @Column(name = "last_name", length = 25)
    private String last_name;

    @Column(name = "email", length = 25)
    private String email;

    @Column(name = "phone_number", length = 20)
    private String phone_number;

    @Column(name = "hire_date")
    private Date hire_date;

    @Column(name = "job_id", length = 10)
    private String job_id;

    @Column(name = "salary")
    private DecimalFormat salary;

    @Column(name = "commission_pct")
    private DecimalFormat commission_pct;

    @Column(name = "manager_id")
    private Integer manager_id;

    @Column(name = "department_id")
    private Integer department_id;


}

