package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "missions", uniqueConstraints = { @UniqueConstraint(columnNames = { "mission_name" })})
public class Mission {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    @Column(name = "mission_name")
    private String mission_name;
    @Column(name = "mission_id")
    private String mission_id;
    @Column(name = "wikipedia")
    private String wikipedia;
    @Column(name = "website")
    private String website;
    @Column(name = "twitter")
    private String twitter;
    @Column(name = "description")
    private String description;
    @Column(name="created_at")
    private String created_at;
    @Column(name = "updated_at")
    private String updated_at;
}
