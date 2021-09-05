package com.example.demo.models;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "headquarters")
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Headquarter {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    @Column(name="address")
    private String address;
    @Column(name="city")
    private String city;
    @Column(name="state")
    private String state;
    @Column(name="created_at")
    private String created_at;
    @Column(name = "updated_at")
    private String updated_at;

}
