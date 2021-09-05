package com.example.demo.models;


import javax.persistence.*;

@Entity
@Table(name = "rockets", uniqueConstraints = { @UniqueConstraint(columnNames = { "ship_id" })})
public class Ship {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column(name = "ship_id")
    private String ship_id;
    @Column(name = "ship_name")
    private String ship_name;
    @Column(name = "ship_model")
    private String ship_model;
    @Column(name = "ship_type")
    private String ship_type;
    @Column(name = "active")
    private Boolean active;
    @Column(name = "imo")
    private Integer imo;
    @Column(name = "mmsi")
    private Integer mmsi;
    @Column(name = "abs")
    private Integer abs;
    @Column(name = "ship_class")
    private Integer ship_class;
    @Column(name = "weight_lbs")
    private Integer weight_lbs;
    @Column(name = "weight_kg")
    private Integer weight_kg;
    @Column(name = "year_built")
    private Integer year_built;
    @Column(name = "home_port")
    private String home_port;
    @Column(name = "status")
    private String status;
    @Column(name = "speed_kn")
    private Integer speed_kn;
    @Column(name = "course_deg")
    private String course_deg;
    @Column(name = "successful_landings")
    private String successful_landings;
    @Column(name = "attempted_landings")
    private String attempted_landings;
    @Column(name = "url")
    private String url;
    @Column(name = "image")
    private String image;
    @Column(name="created_at")
    private String created_at;
    @Column(name = "updated_at")
    private String updated_at;
}
