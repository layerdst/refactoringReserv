package com.reserv.entity;

import com.reserv.entity.ProductPrice;
import com.reserv.entity.ReservationInfo;

import javax.persistence.*;

@Entity
public class ReservationInfoPrice {

    @Id
    @GeneratedValue
    @Column(name="reservation_info_price_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name="reservation_info_id")
    private ReservationInfo reservationInfo;

    @ManyToOne
    @JoinColumn(name="product_price_id")
    private ProductPrice productPrice;

    private int count;

}
