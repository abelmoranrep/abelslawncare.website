package com.abelslawncare.website.Models;

import jakarta.persistence.*;

/**
 * Employee Accounts and Information
 * @author Abel Moran Jr
 */

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

    // Many employees to team
    @ManyToOne
    @JoinColumn(name = "assigned_team_id")
    private AssignedTeam assignedTeam;

    public Employee(String name, String username, String password,
                    String workEmail, String phoneNumber, Boolean manager){
        this.name = name;
        this.username = username;
        this.password = password;
        this.workEmail = workEmail;
        this.phoneNumber = phoneNumber;
        this.manager = manager;
    }

    public Employee() {}

    public long getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getWorkEmail() {
        return workEmail;
    }

    public void setWorkEmail(String workEmail) {
        this.workEmail = workEmail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Boolean getManager() {
        return manager;
    }

    public void setManager(Boolean manager) {
        this.manager = manager;
    }
}