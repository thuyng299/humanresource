package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "assignment")
public class Assignment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "number_of_hour", nullable = false)
    private int numberOfHour;
    @ManyToOne
    @JoinColumn(name = "employeeid")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "projectid")
    private Project project;
}
