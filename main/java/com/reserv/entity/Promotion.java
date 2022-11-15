package com.reserv.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Promotion {

    @Id
    @Column(name="promotion_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="product_id")
    private Product product;


}
