package com.example.demo.models;
import javax.persistence.*;

@Entity
@Table(name = "engines", uniqueConstraints = { @UniqueConstraint(columnNames = { "name" })})
public class Engine {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    @Column(name = "number")
    private Integer number;
    @Column(name = "type")
    private String type;
    @Column(name = "version")
    private String version;
    @Column(name = "layout")
    private String layout;
    @Column(name = "engine_loss_max")
    private Integer engine_loss_max;
    @Column(name = "propellant_1")
    private String propellant_1;
    @Column(name = "propellant_2")
    private String propellant_2;
    @Column(name="created_at")
    private String created_at;
    @Column(name = "updated_at")
    private String updated_at;
}
