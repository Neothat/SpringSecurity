package ru.geekbrains.sringsecurity.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "authorities")
public class Authorities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;
}
