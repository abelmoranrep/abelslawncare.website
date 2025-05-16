package com.abelslawncare.website.Employee;

import com.abelslawncare.website.AssignedTeam.AssignedTeam;
import jakarta.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String username;
    private String password;
    private String workEmail;
    private String phoneNumber;
    private Boolean manager;

    @ManyToOne
    @JoinColumn(name = "assigned_team_id")
    private AssignedTeam assignedTeam;

    // Getters and setters
}