package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "relatives")
public class Relatives {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "full_name", nullable = false)
    private String fullName;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "relationship", nullable = false)
    private String relationship;
    @ManyToOne
    @JoinColumn(name = "employeeid", nullable = false)
    private Employee employee;
}
