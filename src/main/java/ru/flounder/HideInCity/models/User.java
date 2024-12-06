package ru.flounder.HideInCity.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "user_d")
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column
    private Long id;
    @Column
    private String username;
    @Column
    private String password;
    @Column
    private String email;
}
