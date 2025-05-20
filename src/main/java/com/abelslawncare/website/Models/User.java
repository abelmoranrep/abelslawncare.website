package com.abelslawncare.website.Models;

import com.abelslawncare.website.Enum.AccountStatus;
import jakarta.persistence.*;
import java.util.List;

/**
 * User Account and Information
 * @author Abel Moran Jr
 */

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String email;
    private String username;
    private String password;

    // Allows AccountStatus to be treated as a String
    @Enumerated(EnumType.STRING)
    private AccountStatus status;

    // User can have multiple workOrders
    @OneToMany(mappedBy = "user")
    private List<WorkOrder> workOrders;

    public User(String name, String email, String username, String password, AccountStatus status, List<WorkOrder> workOrders) {
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
        this.status = status;
        this.workOrders = workOrders;
    }

    public User() {}

    public Long getId(){
        return id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public List<WorkOrder> getWorkOrders() {
        return workOrders;
    }

    public void setWorkOrders(List<WorkOrder> workOrders) {
        this.workOrders = workOrders;
    }
}
