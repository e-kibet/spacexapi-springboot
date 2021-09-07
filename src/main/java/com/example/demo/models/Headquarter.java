package com.example.demo.models;

import lombok.*;
import lombok.experimental.Accessors;
import javax.persistence.*;

@Entity
@Table(name = "headquarters")
@ToString
@Getter
@Data
@EqualsAndHashCode(callSuper = false)
@Setter
@Accessors(chain=true)
@AllArgsConstructor
@NoArgsConstructor
public class Headquarter extends DateAudit {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    @Column(name="address")
    private String address;
    @Column(name="city")
    private String city;
    @Column(name="state")
    private String state;
//    @CreationTimestamp
//    @Temporal(TemporalType.TIMESTAMP)
//    @Column(name="created_at")
//    private Date created_at;
//    @UpdateTimestamp
//    @Temporal(TemporalType.TIMESTAMP)
//    @Column(name = "updated_at")
//    private Date updated_at;

}
