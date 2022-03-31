package com.jb.coupon2.beans;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@ToString
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String fName;
    private String lName;
    private String email;
    private String password;
    @ManyToMany
    private List<Coupon> coupons;



}
