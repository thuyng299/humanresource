package com.example.demo.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "departmentName", nullable = false, unique = true)
    private String name;
    @Column(name = "start_date")
    private LocalDate startDate;
}
