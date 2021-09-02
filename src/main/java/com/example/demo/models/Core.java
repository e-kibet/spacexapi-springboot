package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "cores", uniqueConstraints = { @UniqueConstraint(columnNames = { "name" })})
public class Core {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    @Column(name = "core_serial")
    private String core_serial;
    @Column(name = "block")
    private String block;
    @Column(name = "status")
    private String status;
    @Column(name = "original_launch")
    private String original_launch;
    @Column(name = "original_launch_unix")
    private String original_launch_unix;
    @Column(name = "reuse_count")
    private Integer reuse_count;
    @Column(name = "rtls_attempts")
    private Integer rtls_attempts;
    @Column(name = "rtls_landings")
    private Integer rtls_landings;
    @Column(name = "asds_attempts")
    private Integer asds_attempts;
    @Column(name = "asds_landings")
    private Integer asds_landings;
    @Column(name = "water_landing")
    private Boolean water_landing;
    @Column(name = "details")
    private String details;
}
