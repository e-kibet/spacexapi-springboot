package com.example.demo.payload;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@EqualsAndHashCode()
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HeadquarterResponse {
    private Integer id;
    private String address;
    private String city;
    private String state;
    private Date created_at;
    private Date updated_at;
}
