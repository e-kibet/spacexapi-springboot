package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "landpads", uniqueConstraints = { @UniqueConstraint(columnNames = { "name" })})
public class Landpad {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
}
