package com.portfolio.uzair.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "input_portfolio")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob // Indicates a large object
    @Column(name = "message")
    private String message;

    @Column(name = "email", nullable = false)
    private String email;
}
