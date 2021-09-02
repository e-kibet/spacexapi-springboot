package com.example.demo.models;


import javax.persistence.*;

@Entity
@Table(name = "links", uniqueConstraints = { @UniqueConstraint(columnNames = { "reddit" })})
public class Link {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    @Column(name = "reddit")
    private String reddit;
    @Column(name = "article")
    private String article;
    @Column(name = "wikipedia")
    private String wikipedia;
    @Column(name="created_at")
    private String created_at;
    @Column(name = "updated_at")
    private String updated_at;
}
