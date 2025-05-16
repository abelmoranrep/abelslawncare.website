package com.abelslawncare.website.assignedTeam;

import jakarta.persistence.*;

@Entity
@Table(name = "assignedTeams")
public class assignedTeam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private long employee1;

    @Column
    private long employee2;
}
