package com.example.demo.models;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "companies", uniqueConstraints = { @UniqueConstraint(columnNames = { "name" })})
public class Company {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    @NotBlank
    @Column(name = "name")
    @Size(max = 40)
    private String name;
    @Column(name = "founder")
    private String founder;
    @Column(name = "founded")
    private String founded;
    @Column(name = "employees")
    private String employees;
    @Column(name  = "vehicles")
    private String vehicles;
    @Column(name = "launch_sites")
    private String launch_sites;
    @Column(name = "test_sites")
    private String test_sites;
    @Column(name = "ceo")
    private String ceo;
    @Column(name = "cto")
    private String cto;
    @Column(name = "coo")
    private String coo;
    @Column(name  ="cto_propulsion")
    private String cto_propulsion;
    @Column(name = "valuation")
    private String valuation;
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Headquarter> headquarterList;
    @Column(name = "summary")
    private String summary;
    @Column(name="created_at")
    private String created_at;
    @Column(name = "updated_at")
    private String updated_at;
}
