package com.reserv.entity;

import com.reserv.entity.embeddable.BaseTimeEntity;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
public class DisplayInfo extends BaseTimeEntity {

    @Id
    @Column(name = "display_info_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="product_id")
    private Product product;

    @Column(length = 10000)
    private String openingHours;
    private String placeName;
    private String placeLot;
    private String placeStreet;
    private String tel;
    private String homepage;
    private String email;

    public void setProduct(Product product){
        this.product = product;

    }

}
