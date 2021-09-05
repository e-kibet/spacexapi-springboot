package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "orbits", uniqueConstraints = { @UniqueConstraint(columnNames = { "reference_system" })})
public class Orbit {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    @Column(name = "reference_system")
    private String reference_system;
    @Column(name = "regime")
    private String regime;
    @Column(name  ="longitude")
    private String longitude;
    @Column(name = "semi_major_axis_km")
    private String semi_major_axis_km;
    @Column(name = "eccentricity")
    private String eccentricity;
    @Column(name = "periapsis_km")
    private String periapsis_km;
    @Column(name  = "apoapsis_km")
    private String apoapsis_km;
    @Column(name = "inclination_deg")
    private String inclination_deg;
    @Column(name = "period_min")
    private String period_min;
    @Column(name = "lifespan_years")
    private String lifespan_years;
    @Column(name="created_at")
    private String created_at;
    @Column(name = "updated_at")
    private String updated_at;

}
