package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "capsules", uniqueConstraints = { @UniqueConstraint(columnNames = { "capsule_serial" })})
public class Capsule {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    @Column(name = "capsule_serial")
    private String capsule_serial;
    @Column(name = "capsule_id")
    private String capsule_id;
    @Column(name = "status")
    private String status;
    @Column(name = "original_launch")
    private String original_launch;
    @Column(name = "original_launch_unix")
    private Integer original_launch_unix;
    @Column(name = "landings")
    private Integer landings;
    @Column(name = "type")
    private String type;
    @Column(name = "details")
    private String details;
    @Column(name = "reuse_count")
    private Integer reuse_count;

}
