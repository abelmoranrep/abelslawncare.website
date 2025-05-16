package com.abelslawncare.website.employee;


import jakarta.persistence.*;

@Entity
@Table(name = "employees")
public class employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String username;

    private String password;

    private String workEmail;

    private String phoneNumber;

    private Boolean manager;
}
