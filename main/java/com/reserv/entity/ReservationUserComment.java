package com.reserv.entity;

import com.reserv.entity.Product;
import com.reserv.entity.ReservationInfo;
import com.reserv.entity.embeddable.BaseTimeEntity;
import lombok.Getter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter
public class ReservationUserComment extends BaseTimeEntity {

    @Id
    @GeneratedValue
    @Column(name = "reservation_user_comment_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name="product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name="reservation_info_id")
    private ReservationInfo reservationInfo;

    private BigDecimal score;
    private String comment;
}
