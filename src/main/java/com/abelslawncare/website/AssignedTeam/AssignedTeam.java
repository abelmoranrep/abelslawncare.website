package com.abelslawncare.website.AssignedTeam;

import com.abelslawncare.website.Employee.Employee;
import com.abelslawncare.website.WorkOrder.WorkOrder;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "assigned_teams")
public class AssignedTeam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "assignedTeam")
    private List<Employee> employees;

    @OneToMany(mappedBy = "assignedTeam")
    private List<WorkOrder> workOrders;

    // Getters and setters
}