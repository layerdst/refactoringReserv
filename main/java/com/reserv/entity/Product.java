package com.reserv.entity;

import com.reserv.entity.embeddable.BaseTimeEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
public class Product extends BaseTimeEntity {

    @Id
    @GeneratedValue
    @Column(name="product_id")
    private Long id;

    private String content;
    private String description;
    private String event;

    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;

    @OneToMany(mappedBy = "product")
    private List<ProductPrice> productPrices;

    @ManyToOne
    @JoinColumn(name="promotion_id")
    private Promotion promotion;



}
