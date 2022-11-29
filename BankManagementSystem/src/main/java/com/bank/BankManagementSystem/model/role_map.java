package com.bank.BankManagementSystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "role_map")
@Getter
@Setter
public class role_map {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long userRoleId;

    //user-role mapping
    @ManyToOne
    @JoinColumn(name = "id")
    private user user;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private role role;
    
}
