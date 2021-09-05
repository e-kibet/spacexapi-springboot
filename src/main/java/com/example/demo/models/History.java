package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "histories")
public class History {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    @Column(name = "title")
    private String title;
    @Column(name = "event_date_utc")
    private String event_date_utc;
    @Column(name = "event_date_unix")
    private String event_date_unix;
    @Column(name = "flight_number")
    private String flight_number;
    @Column(name = "details")
    private String details;
    @Column(name="created_at")
    private String created_at;
    @Column(name = "updated_at")
    private String updated_at;

}
