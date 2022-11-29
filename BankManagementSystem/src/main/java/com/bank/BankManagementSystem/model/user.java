package com.bank.BankManagementSystem.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "user")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class user {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    private String username;
    private String password;
    private String email;
    private String phone;
    private String role;

    // User-Role Mapping
    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private List<role_map> uRole_maps;

}
