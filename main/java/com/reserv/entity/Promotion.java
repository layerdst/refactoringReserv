package com.reserv.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Promotion {

    @Id
    @GeneratedValue
    @Column(name="promotion_id")
    private Long id;

    @OneToMany(mappedBy = "promotion")
    private List<Product> products = new ArrayList<>();



}
