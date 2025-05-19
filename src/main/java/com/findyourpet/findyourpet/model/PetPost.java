package com.findyourpet.findyourpet.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class PetPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type; // "lost" or "found"
    private String petType;
    private String description;
    private String location;
    private String name;
    private String phone;
    private String email;
    private String imageUrl;

    @Column(nullable = false)
    private boolean approved = false;


    public void setApproved(boolean approved) {
        this.approved = approved;
    }
}
