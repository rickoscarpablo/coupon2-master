package com.jb.coupon2.beans;

import javax.persistence.*;

@Entity
@Table(name ="categories")
public class Categories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Enumerated(EnumType.STRING)
    Category category;
}
