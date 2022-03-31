package com.jb.coupon2.beans;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "coupons")
public class Coupon {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private int company_id;
private int category_id;
private String title;
private String description;
private Date start_date;
private Date end_date;
private int amount;
private double price;
private String image;




}
