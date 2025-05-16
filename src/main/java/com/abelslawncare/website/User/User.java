package com.abelslawncare.website.User;

import com.abelslawncare.website.EnumTypes.AccountStatus;
import com.abelslawncare.website.WorkOrder.WorkOrder;
import jakarta.persistence.*;

import java.util.List;



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

    @Enumerated(EnumType.STRING)
    private AccountStatus status;

    @OneToMany(mappedBy = "user")
    private List<WorkOrder> workOrders;

    // Getters and setters
}
