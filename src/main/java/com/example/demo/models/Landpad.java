package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "landpads", uniqueConstraints = { @UniqueConstraint(columnNames = { "name" })})
public class Landpad {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    @Column(name = "full_name")
    private String full_name;
    @Column(name = "status")
    private String status;
    @Column(name ="landing_type")
    private String landing_type;
    @Column(name = "attempted_landings")
    private Integer attempted_landings;
    @Column(name = "successful_landings")
    private Integer successful_landings;
    @Column(name = "wikipedia")
    private String wikipedia;
    @Column(name = "details")
    private String details;
    @Column(name="created_at")
    private String created_at;
    @Column(name = "updated_at")
    private String updated_at;



}
