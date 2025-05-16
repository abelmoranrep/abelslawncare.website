package com.abelslawncare.website.WorkOrder;


import com.abelslawncare.website.AssignedTeam.AssignedTeam;
import com.abelslawncare.website.User.User;
import jakarta.persistence.*;
import java.time.LocalDate;
import com.abelslawncare.website.EnumTypes.ReoccurringStatus;

@Entity
@Table(name = "work_orders")
public class WorkOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String address;
    private LocalDate date;

    @Enumerated(EnumType.STRING)
    private ReoccurringStatus status;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "assigned_team_id")
    private AssignedTeam assignedTeam;

    // Getters and setters
}