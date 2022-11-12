package com.reserv.entity;

import com.reserv.entity.embeddable.BaseTimeEntity;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
public class ReservationInfo extends BaseTimeEntity {

    @Id
    @GeneratedValue
    @Column(name="reservation_info_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name="product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name="display_info_id")
    private DisplayInfo displayInfo;

    private String reservationName;
    private String reservationTel;
    private String reservationEmail;
    private LocalDateTime reservationDate;
    private boolean cancelFlag;

}