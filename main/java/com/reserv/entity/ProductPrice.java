package com.reserv.entity;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.reserv.entity.embeddable.BaseTimeEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter
@NoArgsConstructor
public class ProductPrice extends BaseTimeEntity {

    @Id
    @GeneratedValue
    @Column(name="product_price_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name="product_id")
    private Product product;

    @Enumerated(EnumType.STRING)
    private PriceType priceTypeName;

    private int price;

    @Column(precision = 5, scale = 4)
    private BigDecimal discountRate;



}
