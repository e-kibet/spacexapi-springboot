package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "payloads", uniqueConstraints = { @UniqueConstraint(columnNames = { "name" })})
public class Payload {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    @Column(name = "payload_id")
    private String payload_id;
    @Column(name  ="reused")
    private boolean reused;
    @Column(name = "nationality")
    private String nationality;
    @Column(name = "manufacturer")
    private String manufacturer;
    @Column(name = "payload_type")
    private String payload_type;
    @Column(name = "payload_mass_kg")
    private Integer payload_mass_kg;
    @Column(name = "payload_mass_lbs")
    private Integer payload_mass_lbs;
    @Column(name = "orbit")
    private String orbit;

}
