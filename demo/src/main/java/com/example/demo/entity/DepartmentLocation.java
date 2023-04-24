package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "department_location")
public class DepartmentLocation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "location", nullable = false, unique = true)
    private String location;

    @ManyToOne
    @JoinColumn(name = "deptid")
    private Department department;



}
