package com.abelslawncare.website.Models;

import jakarta.persistence.*;
import java.util.List;

/**
 * Team of Employees to handle work orders
 * Each team may have multiple employees and work orders
 * @author Abel Moran Jr
 */

@Entity
@Table(name = "assigned_teams")
public class AssignedTeam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Many Employees Per Team
    @OneToMany(mappedBy = "assignedTeam")
    private List<Employee> employees;

    // Many Work Orders
    @OneToMany(mappedBy = "assignedTeam")
    private List<WorkOrder> workOrders;

    public AssignedTeam(List<Employee> employees, List<WorkOrder> workOrders){
        this.employees = employees;
        this.workOrders = workOrders;
    }

    public AssignedTeam() {}

    public Long getId(){
        return id;
    }

    public List<Employee> getEmployees(){
        return employees;
    }

    public void setEmployees(List<Employee> employees){
        this.employees = employees;
    }

    public List<WorkOrder> getWorkOrders(){
        return workOrders;
    }

    public void setWorkOrders(List<WorkOrder> workOrders){
        this.workOrders = workOrders;
    }
}