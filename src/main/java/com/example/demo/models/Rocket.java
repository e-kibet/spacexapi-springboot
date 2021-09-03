package com.example.demo.models;


import javax.persistence.*;

@Entity
@Table(name = "rockets", uniqueConstraints = { @UniqueConstraint(columnNames = { "name" })})
public class Rocket {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    @Column(name = "active")
    private Boolean active;
    @Column(name = "stages")
    private Integer stages;
    @Column(name = "boosters")
    private Integer boosters;
    @Column(name = "cost_per_launch")
    private Integer cost_per_launch;
    @Column(name = "success_rate_pct")
    private Integer success_rate_pct;
    @Column(name = "first_flight")
    private String first_flight;
    @Column(name = "country")
    private String country;
    @Column(name = "company")
    private String company;
    @Column(name = "wikipedia")
    private String wikipedia;
    @Column(name = "description")
    private String description;
    @Column(name = "rocket_id")
    private String rocket_id;
    @Column(name = "rocket_name")
    private String rocket_name;
    @Column(name = "rocket_type")
    private String rocket_type;


}
