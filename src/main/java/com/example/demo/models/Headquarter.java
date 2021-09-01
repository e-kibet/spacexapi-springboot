package com.example.demo.models;

import javax.persistence.*;

@Entity
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

    public Headquarter() {
    }

    public Headquarter(String address, String city, String state) {
        this.address = address;
        this.city = city;
        this.state = state;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
