package com.findyourpet.findyourpet.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String phone;
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public enum Role {
        USER, ADMIN
    }
}
