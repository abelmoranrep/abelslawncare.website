package com.abelslawncare.website.workOrder;


import com.abelslawncare.website.enumTypes.reoccuringStatus;
import jakarta.persistence.*;

@Entity
@Table(name = "workOrders")
public class workOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String address;

    @Column
    private reoccuringStatus status;

    @Column
    private long user_id;

    @Column
    private long team_id;
}
