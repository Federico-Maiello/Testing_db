package com.example.exercise9.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false)
    private String firstName;
    @Column(unique = true, nullable = false)
    private String email;

}
