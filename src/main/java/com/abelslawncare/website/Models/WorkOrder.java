package com.abelslawncare.website.Models;

import jakarta.persistence.*;
import java.time.LocalDate;
import com.abelslawncare.website.Enum.ReoccurringStatus;

/**
 * WorkOrder Scheduling
 * @author Abel Moran Jr
 */

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

    // Many WorkOrders per user
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // Many WorkOrders per team
    @ManyToOne
    @JoinColumn(name = "assigned_team_id")
    private AssignedTeam assignedTeam;

    public WorkOrder(String address, LocalDate date, ReoccurringStatus status, User user, AssignedTeam assignedTeam) {
        this.address = address;
        this.date = date;
        this.status = status;
        this.user = user;
        this.assignedTeam = assignedTeam;
    }

    public WorkOrder(){};

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public ReoccurringStatus getStatus() {
        return status;
    }

    public void setStatus(ReoccurringStatus status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public AssignedTeam getAssignedTeam() {
        return assignedTeam;
    }

    public void setAssignedTeam(AssignedTeam assignedTeam) {
        this.assignedTeam = assignedTeam;
    }
}