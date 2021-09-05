package com.example.demo.payload;

import lombok.Data;

import java.util.Date;

@Data
public class HeadquarterResponse {
    private Integer id;
    private String address;
    private String city;
    private String state;
    private Date created_at;
    private Date updated_at;

    public HeadquarterResponse(Integer id, String address, String city, String state, Date created_at, Date updated_at){
        this.id = id;
        this.address = address;
        this.city = city;
        this.state = state;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }
}
