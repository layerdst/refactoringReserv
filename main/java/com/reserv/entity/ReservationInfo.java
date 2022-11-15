package com.reserv.entity;

import com.reserv.entity.embeddable.BaseTimeEntity;
import lombok.Getter;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
public class ReservationInfo extends BaseTimeEntity {

    @Id
    @Column(name="reservation_info_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="product_id")
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="display_info_id")
    private DisplayInfo displayInfo;

    private String reservationName;
    private String reservationTel;
    private String reservationEmail;
    private LocalDateTime reservationDate;

    @ColumnDefault("0")
    private int cancelFlag;

}
